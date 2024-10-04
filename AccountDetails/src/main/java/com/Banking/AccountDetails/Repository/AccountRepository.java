package com.Banking.AccountDetails.Repository;

import com.Banking.AccountDetails.Entity.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<AccountDetails, Long> {

    public AccountDetails findByAdharNumber(long adharNumber);
    public AccountDetails findByAccountNumber(long accountNumber);

//    public AccountDetails save(AccountDetails accountDetails);
}
//write addition of two numbers
