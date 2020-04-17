package com.example.demo2.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Account")
public class Account {

   public double accountId;
    public int accountNum;
    public String accountCompCode;
    public String currency;
    public double balance;
    public String type;

    private List<Customer> relatedCustomer;

    TransitionHistoryDetails latestTransitionDetails;

    CreditLimitUtilizationDetails latestCreditLimitUtilization;

  

}
