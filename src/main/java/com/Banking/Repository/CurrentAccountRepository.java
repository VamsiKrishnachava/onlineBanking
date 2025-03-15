package com.Banking.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Banking.Entity.CurrentAccount;

@Repository
public interface CurrentAccountRepository extends JpaRepository<CurrentAccount, Integer>{
    CurrentAccount findByAccountNumber(int accountNumber);

    //example to understand the working

    @Query(value = "SELECT * FROM current_accounts WHERE balance > 0" , nativeQuery = true)
    List<CurrentAccount> findAllPositiveBalanceAccounts();
}
