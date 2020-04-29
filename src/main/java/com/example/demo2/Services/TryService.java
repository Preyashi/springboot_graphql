package com.example.demo2.Services;

import com.example.demo2.Entity.Try;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TryService {
    public List<Try> getAllTry();
}
