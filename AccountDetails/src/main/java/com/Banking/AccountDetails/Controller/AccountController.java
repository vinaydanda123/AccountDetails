package com.Banking.AccountDetails.Controller;

import com.Banking.AccountDetails.Entity.AccountDetails;
import com.Banking.AccountDetails.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @PostMapping("/saveAccount")
    public AccountDetails saveAccount(@RequestBody AccountDetails accountDetails) {

        AccountDetails accountDet = accountService.fetchUserByAdharNumber(accountDetails.getAdharNumber());
        if(accountDet!=null){
            throw new RuntimeException("Adhar number already present");
        }
        return accountService.saveAccount(accountDetails);
    }
    @GetMapping("/fetchUserByAdharNumber/{adharNumber}")
    public AccountDetails fetchUserByAdharNumber(@PathVariable long adharNumber) throws RuntimeException{
        AccountDetails accountDet = accountService.fetchUserByAdharNumber(adharNumber);
        if(accountDet==null){
            throw new RuntimeException("No Account matched with the given Adhar Number");
        }
        return accountDet;

    }

    @GetMapping("/fetchUserByAccountNumber/{accountNumber}")
    public AccountDetails fetchUserByAccountNumber(@PathVariable long accountNumber) {
        return accountService.fetchUserByAccountNumber(accountNumber);
    }
    @PostMapping("/updateBalance/{accountNumber}/{balance}")
    public AccountDetails updateBalance(@PathVariable long accountNumber,@PathVariable double balance){
        AccountDetails accountDetails = accountService.updateBalance(accountNumber,balance);
        return accountDetails;
    }
    @PostMapping("/fetchUserByAccountNumber/{accountNumber}")
    public AccountDetails fetchUserByAccountNumber1(@PathVariable long accountNumber) {
        return accountService.fetchUserByAccountNumber(accountNumber);
    }
    @GetMapping("/fetchBalance/{accountNumber}")
    public double fetchBalance(@PathVariable long accountNumber){
        AccountDetails accountDetails = accountService.fetchUserByAccountNumber(accountNumber);
        return accountDetails.getBalance();
    }

}
