package com.example.demo2.Services;

import com.example.demo2.Entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {



    Account findAccount(double id);

    List<CreditLimitUtilizationDetails> findCreditLimitUtilByAccId(double accountID);

    List<TransitionHistoryDetails> findTransitionHistoryByAccID(double accountId);
}
