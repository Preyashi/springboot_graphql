package com.example.demo2.Repository;

import com.example.demo2.Entity.TransitionHistory;
import com.example.demo2.Entity.TransitionHistoryDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransitionHistoryRepository extends MongoRepository<TransitionHistory,Void> {

    @Query("{ 'accountId' : ?0 }")
    TransitionHistory findByAccountId(double accountId);

}
