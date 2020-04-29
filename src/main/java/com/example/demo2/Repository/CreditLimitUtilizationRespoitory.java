package com.example.demo2.Repository;

import com.example.demo2.Entity.CreditLimitUtilization;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditLimitUtilizationRespoitory extends MongoRepository<CreditLimitUtilization, Void> {

    @Query("{ 'accountId' : ?0 }")
    CreditLimitUtilization getCreditLimitUtilizationByAccountId(double accountID);

}
