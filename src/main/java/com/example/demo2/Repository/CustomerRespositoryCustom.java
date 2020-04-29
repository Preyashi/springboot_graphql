package com.example.demo2.Repository;

import com.example.demo2.Entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CustomerRespositoryCustom {

    List<Customer> resultDynamicQuery(Map<String,String> param);

}
