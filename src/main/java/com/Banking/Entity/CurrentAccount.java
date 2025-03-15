package com.Banking.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "current_accounts")
public class CurrentAccount extends AbstractAccount {

    @Column(nullable = false)
    private double overDraftLimit;

    public CurrentAccount(){
        super.setAccountType(AccountType.CURRENT_ACCOUNT);
    }   

    public void setOverDraftLimit(double ODLimit){ this.overDraftLimit = ODLimit;}
    public double getOverDraftLimit() {return this.overDraftLimit;}
}
