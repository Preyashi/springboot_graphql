package com.example.demo2.Services;

import com.example.demo2.Entity.Try;
import com.example.demo2.Repository.TryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TryServiceImpl implements TryService {

    @Autowired
    TryRepository tryRepository;
    @Override
    public List<Try> getAllTry() {
        return tryRepository.findAll();
    }
}
