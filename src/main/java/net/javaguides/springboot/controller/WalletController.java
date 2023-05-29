package net.javaguides.springboot.controller;

import java.util.List;

import net.javaguides.springboot.entity.Wallet;
import net.javaguides.springboot.entity.WalletDetail;
import net.javaguides.springboot.repository.WalletDetailRepository;
import net.javaguides.springboot.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class WalletController {

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private WalletDetailRepository detailRepository;

    // 查询用户钱包余额
    @GetMapping("/getByUid/{userId}")
    public Wallet createUser(@PathVariable("userId") String userId) {
        Wallet wallet =  this.walletRepository.getByUserId(userId);
        return wallet;
    }

    // 用户消费100元的接口
    @PostMapping("/consumer")
    public Wallet consumer(@RequestBody Wallet tmp) throws Exception{
        Wallet wallet = this.walletRepository.getByUserId(tmp.getUserId());
        if(wallet == null){
            throw new Exception("user is not exists");
        }
        wallet.setMoney(wallet.getMoney() - 100);
        this.walletRepository.save(wallet);
        return wallet;
    }

    // 用户退款20元接口
    @PostMapping("/refund")
    public Wallet refund(@RequestBody Wallet tmp) throws Exception{
        Wallet wallet = this.walletRepository.getByUserId(tmp.getUserId());
        if(wallet == null){
            throw new Exception("user is not exists");
        }
        wallet.setMoney(wallet.getMoney()+20);
        this.walletRepository.save(wallet);
        return wallet;
    }

    // 查询用户钱包余额
    @GetMapping("/getDetails/{userId}")
    public List<WalletDetail> getDetails(@PathVariable("userId") String userId) {
        return this.detailRepository.getWalletDetailsByUserId(userId);
    }

}
