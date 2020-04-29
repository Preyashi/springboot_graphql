package com.example.demo2.Resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo2.Entity.Account;
import com.example.demo2.Entity.Customer;
import com.example.demo2.Services.AccountService;
import com.example.demo2.Services.CustomerService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    AccountService accountService;

    @Autowired
    CustomerService customerService;



    public List<Customer> findCustomers(){
        return customerService.getCustomers();
    }

    public Customer findCustomer(final float custId, final float custNum, final float custTieBrkr){
        return customerService.getCustomers(custId,custNum,custTieBrkr);
    }

    public List<Account> findAccounts(){
        return accountService.getAccounts();
    }

    public  Account findAccount(final float accountId,final float accountNum,final String accountCompCode){
        return  accountService.getAccountByaccountIdAndAccountNumAndAccountCompCode(accountId, accountNum, accountCompCode);
    }
}
