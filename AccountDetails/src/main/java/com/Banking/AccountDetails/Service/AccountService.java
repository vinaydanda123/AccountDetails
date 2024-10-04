package com.Banking.AccountDetails.Service;

import com.Banking.AccountDetails.Entity.AccountDetails;
import com.Banking.AccountDetails.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public AccountDetails saveAccount(AccountDetails accountDetails) {
        return accountRepository.save(accountDetails);
    }
    public AccountDetails fetchUserByAdharNumber(long adharNumber) {
        return accountRepository.findByAdharNumber(adharNumber);
    }
    public AccountDetails fetchUserByAccountNumber(long accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }
    public AccountDetails updateBalance(long accountNumber, double balance) {
        AccountDetails accountDetails = accountRepository.findByAccountNumber(accountNumber);
        accountDetails.setBalance(balance);
        return accountRepository.save(accountDetails);
    }
}
