package com.example.demo2.Controller;

import com.example.demo2.Entity.Account;
import com.example.demo2.Entity.CreditLimitUtilizationDetails;
import com.example.demo2.Entity.TransitionHistory;
import com.example.demo2.Entity.TransitionHistoryDetails;
import com.example.demo2.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

  /*  @RequestMapping(path="/accounts/{accountId}")
    public Account getAccount(@PathVariable(required = false) double accountId){
        if(accountId==0)accountId=123653435d;
        return accountService.findAccount(accountId);
    }
*/
  /*  @RequestMapping(path="/accounts", method = RequestMethod.GET)
    public List<Account> getAccountByCustNum(@RequestParam( required = false, value="custNum", defaultValue = "1234567") double custNum){
        return accountService.findAccByCustNum(custNum);
    }*/

    @RequestMapping(path="/accounts/{accountId}/transHist")
    public List<TransitionHistoryDetails> getTransHistByAccId(@PathVariable(required = false) double accountId){
        if(accountId==0)accountId=123653435d;
        return accountService.findTransitionHistoryByAccID(accountId);
    }

    @RequestMapping(path="/accounts/{accountId}/creditLimitUtil")
    public List<CreditLimitUtilizationDetails> getCreditLimitUtilByAccId(@PathVariable(required = false) double accountId){
        if(accountId==0)accountId=123653435d;
        return accountService.findCreditLimitUtilByAccId(accountId);
    }





}
