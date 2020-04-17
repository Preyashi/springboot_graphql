package com.example.demo2.Services;

import com.example.demo2.Entity.Account;
import com.example.demo2.Entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    public List<Customer> getCustomers();
    public Customer findCustByName(String FirstName);


}
