package com.example.demo2.Resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo2.Entity.Account;
import com.example.demo2.Entity.Customer;
import com.example.demo2.Services.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CustomerResolver implements GraphQLResolver<Customer> {

    @Autowired
    AccountService accountService;

    public List<Account> getRelatedAccounts(Customer customer){
        System.out.println("came here"+customer.toString());
        return accountService.findAccountByAccountNum(customer.relatedAccounts);
    }

}
