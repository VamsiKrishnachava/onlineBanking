package com.Banking.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "savings_accounts")
public class SavingsAccount extends AbstractAccount{

    @Column(nullable = false)
    private double intrestRate;
    public SavingsAccount(){
        super.setAccountType(AccountType.SAVINGS_ACCOUNT);
    }   

    public void setIntrestRate(double intrestRate) { this.intrestRate = intrestRate;}
    public double getIntrestRate() { return this.intrestRate;}
}
