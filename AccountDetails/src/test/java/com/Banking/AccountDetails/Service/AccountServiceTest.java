package com.Banking.AccountDetails.Service;

import com.Banking.AccountDetails.Entity.AccountDetails;
import com.Banking.AccountDetails.Repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class AccountServiceTest {

    @InjectMocks
    AccountService accountService;
    @Mock
    AccountRepository accountRepository;
    AccountDetails accountDetails;
    @BeforeEach
    void setup(){
        accountDetails = new AccountDetails();
        accountDetails.setAccountNumber(1234567890);
        accountDetails.setAdharNumber(1234567890);
        when(accountRepository.save(accountDetails)).thenReturn(accountDetails);
    }

    @Test
    void saveAccount() {


        assertNotNull(accountRepository.findAll());

//        assertNull(accountService.fetchUserByAccountNumber(1234567890));
//        assertNotNull(accountRepository.findByAccountNumber(1234567890));
//        Mockito.when(accountRepository.findByAccountNumber(Mockito.anyLong())).thenReturn(accountDetails);
//        assertNotNull(accountRepository.findByAccountNumber(1234567890));
//        Mockito.when(accountRepository.findByAdharNumber(Mockito.anyLong())).thenReturn(accountDetails);
//        assertTrue(accountRepository.findByAdharNumber(Mockito.anyLong()).equals(accountDetails));
//        assertEquals(accountRepository.findByAccountNumber(Mockito.anyLong()),accountDetails);

    }
    @Test
    void fetchUserByAdharNumber(){
        when(accountRepository.findByAdharNumber(1234567890));
        assertNotNull(accountRepository.findByAccountNumber(1234567890));
//        assertNotNull(accountService.fetchUserByAccountNumber(1234567890));
    }
}