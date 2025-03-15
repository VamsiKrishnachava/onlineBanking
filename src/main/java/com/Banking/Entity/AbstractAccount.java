package com.Banking.Entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractAccount implements Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountType accountType;

    @Column(nullable = false)
    private double balance;

    @Column(nullable = false, updatable = false)
    private Timestamp createdOn;
    
    enum AccountType{
        SAVINGS_ACCOUNT,
        CURRENT_ACCOUNT
    }

    public AbstractAccount(){
        this.balance = 0.0;
        this.createdOn = Timestamp.valueOf(LocalDateTime.now());
    }

    @Override
    public int getAccountNumber(){ return this.accountNumber; }
    @Override
    public AccountType getAccountType(){ return this.accountType;}
    @Override
    public void setAccountType(AccountType accountType) {this.accountType = accountType;}
    @Override
    public double getBalance(){ return this.balance; }
    @Override
    public void setBalance(double balance) {this.balance = balance;}
    @Override
    public Timestamp getCreatedOn() { return this.createdOn; }

    
}
