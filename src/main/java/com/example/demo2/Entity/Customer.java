package com.example.demo2.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Customer")
public class Customer {

    private String firstName;
    private String lastName;
    Float custNum;
    Float custId;
    Float custTieBrkr;
    //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE,style = "YYYYMMDD")
    private String dob;
    private String address;
    private String city;
    private String country;
    private String riskIndicator;

   // @ManyToOne
    //@JoinColumn(name="accid")
    public List<Account> relatedAccounts;
    
}
