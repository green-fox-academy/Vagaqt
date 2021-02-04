package com.example.demo.service;

import com.example.demo.repository.ExampleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    private ExampleRepo exampleRepo;

    @Autowired
    public ExampleService(ExampleRepo exampleRepo) {
        this.exampleRepo = exampleRepo;
    }
}
