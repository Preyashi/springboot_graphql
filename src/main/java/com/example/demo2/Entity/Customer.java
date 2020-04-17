package com.example.demo2.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Customer")
public class Customer {

    private String firstName;
    private String lastName;
    double custNum;
    int custId;
    int custTieBrkr;
    //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE,style = "YYYYMMDD")
    private String dob;
    private String address;
    private String city;
    private String country;
    private String riskIndicator;

    public List<Account> relatedAccounts;
    
}
