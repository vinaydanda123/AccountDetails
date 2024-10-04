package com.Banking.AccountDetails.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AccountDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountNumber;
    private long adharNumber;
    private  String accountHolderName;
    private String accountType;
    private double balance;
    private String branchName;
    private String ifscCode;
    private long phoneNumber;


}
