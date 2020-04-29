package com.example.demo2.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Account")
public class Account {

   public float accountId;
    public float accountNum;
    public String accountCompCode;
    public String currency;
    public double balance;
    public String type;

    //@OneToMany(mappedBy = "relatedAccounts", cascade = CascadeType.ALL)
    private List<Customer> relatedCustomer;

    TransitionHistoryDetails latestTransitionDetails;

    CreditLimitUtilizationDetails latestCreditLimitUtilization;

  

}
