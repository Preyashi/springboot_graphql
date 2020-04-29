package com.example.demo2.Controller;

import com.example.demo2.Entity.Account;
import com.example.demo2.Entity.Customer;
import com.example.demo2.Entity.Try;
import com.example.demo2.Repository.CustomerRepository;
import com.example.demo2.Services.CustomerService;
import com.example.demo2.Services.CustomerServiceImpl;
import com.example.demo2.Services.TryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    TryService tryService;

    @RequestMapping(path="/customers")
    public Customer getCustomer(){

    return customerService.findCustByName("John");
    }

    @RequestMapping(path = "/try")
    public List<Try> getTry(){
        return tryService.getAllTry();
    }

    @RequestMapping(path="/dynamic")
    public List<Customer> getdymamicCustomer(){
        Map<String,String> stringStringMap = new HashMap<String,String>();
        stringStringMap.put("firstName","John");
        return customerService.findCustByDynamicQuery(stringStringMap);
    }

}
