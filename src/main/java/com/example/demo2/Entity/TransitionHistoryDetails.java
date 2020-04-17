package com.example.demo2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransitionHistoryDetails {
    //@Enumerated(EnumType.ORDINAL)
    private int transMonth;
    private int transNum;
    private float totalMeanTrans;
    private int maxTransPerDay;
    private double maxAmountTrans;
    private double monthlyTotalAmountTrans;
    private double meanAmountTransTillDt;
    private String currency;
}
