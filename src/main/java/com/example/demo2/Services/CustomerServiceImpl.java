package com.example.demo2.Services;

import com.example.demo2.Entity.Account;
import com.example.demo2.Entity.Customer;
import com.example.demo2.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        List<Customer> customerList = new ArrayList<>();

        customerList= customerRepository.findAll();
        return customerList;
    }

    @Override
    public Customer findCustByName(String FirstName) {
        Customer customer = new Customer();
        customer=customerRepository.findByFirstName(FirstName);
        return customer;
    }


}
