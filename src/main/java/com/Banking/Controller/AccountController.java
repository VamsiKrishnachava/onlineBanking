package com.Banking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.Banking.Entity.CurrentAccount;
import com.Banking.Service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("account/current")
    public CurrentAccount createCurrentAccount(@RequestBody CurrentAccount currentAccount){
        return accountService.createCurrentAccount(currentAccount);
    }

    @GetMapping("account/currents")
    public List<CurrentAccount> getCurrentAccount(){
        return accountService.getAllCurrentAccounts();
    }
}


