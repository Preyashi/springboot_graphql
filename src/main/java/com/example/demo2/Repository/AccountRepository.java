package com.example.demo2.Repository;

import com.example.demo2.Entity.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends MongoRepository<Account,Void> {

    @Query("{ 'accountId' : ?0 , 'accountNum' : ?1 , 'accountCompCode' : '?2' }")
    Account getAccountByAccountIdAndAccountNumAndAccountCompCode(float accountId, float accountNum, String accountCompCode);

    @Query("{ 'accountNum' : ?0  }")
    Account getAccountByAccountNum(float accountNum);


}
