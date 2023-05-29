package net.javaguides.springboot.repository;

import net.javaguides.springboot.entity.WalletDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WalletDetailRepository extends JpaRepository<WalletDetail, Long> {

    List<WalletDetail> getWalletDetailsByUserId(String userId);
}
