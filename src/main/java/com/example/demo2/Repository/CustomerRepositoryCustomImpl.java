package com.example.demo2.Repository;

import com.example.demo2.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepositoryCustomImpl implements CustomerRespositoryCustom {
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Customer> resultDynamicQuery(Map<String, String> param){
        List<Customer> listCustomer = new ArrayList<Customer>();
        System.out.println("map:"+param.toString());
        Query query = new Query();
        Object[] keySet = param.keySet().toArray();
        System.out.println("keyset:"+keySet.toString());
        for(int i=0;i<param.size();i++) {
            String key = (String) keySet[i];
            System.out.println(key+":"+param.get(key));
            query.addCriteria(Criteria.where(key).is(param.get(key)));
        }
        listCustomer = mongoTemplate.find(query,Customer.class);
        return listCustomer;
    }
}
