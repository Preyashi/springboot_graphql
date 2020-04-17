package com.example.demo2.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CreditLimitUtilization")
public class CreditLimitUtilization {
    public double accountId;
    public int accountNum;
    public String accountCompCode;
    public List<CreditLimitUtilizationDetails> details;

}
