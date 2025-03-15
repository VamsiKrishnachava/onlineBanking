package com.Banking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking.Entity.SavingsAccount;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Integer>{
    SavingsAccount findByAccountNumber(int accountNumber);
}
