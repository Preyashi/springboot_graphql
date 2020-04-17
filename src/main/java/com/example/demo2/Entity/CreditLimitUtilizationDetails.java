package com.example.demo2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditLimitUtilizationDetails {
    public int creditMonth;
    public double creditLimit;
    public String currency;
    public double utilizationAmount;
    public double meanUtilizationTillDt;
}
