package com.example.demo2.Repository;

import com.example.demo2.Entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.query.MongoEntityMetadata;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Void> {

    List<Customer> findAll();
   // Customer findCustomersByFirstName(String FirstName);
    @Query("{ 'firstName' : ?0 }")
    Customer findByFirstName(String firstname);
}
