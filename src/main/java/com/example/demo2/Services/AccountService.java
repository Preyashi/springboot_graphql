package com.example.demo2.Services;

import com.example.demo2.Entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {


    List<Account> getAccounts();

    Account getAccountByaccountIdAndAccountNumAndAccountCompCode(float accountId,float accountNum, String accountCompCode);

    List<CreditLimitUtilizationDetails> findCreditLimitUtilByAccId(double accountID);

    List<TransitionHistoryDetails> findTransitionHistoryByAccID(double accountId);

    List<Account> findAccountByAccountNum(List<Account> relatedAccounts);
}
