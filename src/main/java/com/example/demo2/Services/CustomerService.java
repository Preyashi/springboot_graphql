package com.example.demo2.Services;

import com.example.demo2.Entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface CustomerService {

    public List<Customer> getCustomers();
    public Customer findCustByName(String FirstName);

    public List<Customer> findCustByDynamicQuery(Map<String,String> param);


   public Customer getCustomers(float custId, float custNum, float custTieBrkr);
}
