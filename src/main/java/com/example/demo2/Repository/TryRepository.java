package com.example.demo2.Repository;

import com.example.demo2.Entity.Try;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TryRepository extends MongoRepository<Try, Void> {
    public List<Try> findAll();
}
