package com.Banking.Entity;

import java.sql.Timestamp;

import com.Banking.Entity.AbstractAccount.AccountType;


public interface Account {
    int getAccountNumber();
    AccountType getAccountType();
    double getBalance();
    void setBalance(double balance);
    Timestamp getCreatedOn();
    void setAccountType(AccountType accountType);
}
