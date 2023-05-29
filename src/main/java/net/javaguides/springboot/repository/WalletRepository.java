package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {

    Wallet getByUserId(String userId);

}
