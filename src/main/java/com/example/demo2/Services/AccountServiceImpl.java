package com.example.demo2.Services;

import com.example.demo2.Entity.Account;
import com.example.demo2.Entity.CreditLimitUtilizationDetails;
import com.example.demo2.Entity.TransitionHistory;
import com.example.demo2.Entity.TransitionHistoryDetails;
import com.example.demo2.Repository.AccountRepository;
import com.example.demo2.Repository.CreditLimitUtilizationRespoitory;
import com.example.demo2.Repository.TransitionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    TransitionHistoryRepository transitionHistoryRepository;

    @Autowired
    CreditLimitUtilizationRespoitory creditLimitUtilizationRespoitory;

    @Override
    public Account findAccount(double AccountId) {
        return accountRepository.getAccountsByAccountId(AccountId);
    }

    @Override
    public List<CreditLimitUtilizationDetails> findCreditLimitUtilByAccId(double accountID) {
        return creditLimitUtilizationRespoitory.getCreditLimitUtilizationByAccountId(accountID).details;
    }

    @Override
    public List<TransitionHistoryDetails> findTransitionHistoryByAccID(double accountId) {
        return transitionHistoryRepository.findByAccountId(accountId).details;
    }


}
