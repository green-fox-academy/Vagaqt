package com.example.demo.service;

import com.example.demo.model.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class GuardianService {

    public ErrorMessage error(String message) {
        return new ErrorMessage(message);
    }
}
