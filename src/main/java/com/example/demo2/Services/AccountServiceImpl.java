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

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
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
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountByaccountIdAndAccountNumAndAccountCompCode(float accountId, float accountNum, String accountCompCode) {
        return accountRepository.getAccountByAccountIdAndAccountNumAndAccountCompCode(accountId,accountNum,accountCompCode);
    }

    @Override
    public List<CreditLimitUtilizationDetails> findCreditLimitUtilByAccId(double accountID) {
        return creditLimitUtilizationRespoitory.getCreditLimitUtilizationByAccountId(accountID).details;
    }

    @Override
    public List<TransitionHistoryDetails> findTransitionHistoryByAccID(double accountId) {
        return transitionHistoryRepository.findByAccountId(accountId).details;
    }

    @Override
    public List<Account> findAccountByAccountNum(List<Account> relatedAccounts) {
        List<Account> listAccount=new ArrayList<Account>();
        System.out.println(relatedAccounts.toString());
        for(int i=0;i<relatedAccounts.size();i++) {
           Account accnt=relatedAccounts.get(i);
            listAccount.add(accountRepository.getAccountByAccountNum(accnt.accountNum));

        }
        System.out.println(listAccount.toString());
        return listAccount;
    }


}
