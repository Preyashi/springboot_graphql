package com.example.demo2.Services;

import com.example.demo2.Entity.Customer;
import com.example.demo2.Repository.CustomerRepository;
import com.example.demo2.Repository.CustomerRespositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerRespositoryCustom customerRespositoryCustom;

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

    @Override
    public List<Customer> findCustByDynamicQuery(Map<String, String> param){
        return customerRespositoryCustom.resultDynamicQuery(param);
    }

    @Override
    public Customer getCustomers(float custId, float custNum, float custTieBrkr) {
        Customer customer = new Customer();
        customer=customerRepository.findByCustIdAAndCustNumAndCustTieBrkr(custId, custNum, custTieBrkr);
        return customer;
    }


}
