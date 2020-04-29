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
    private float maxAmountTrans;
    private float monthlyTotalAmountTrans;
    private float meanAmountTransTillDt;
    private String currency;
}
