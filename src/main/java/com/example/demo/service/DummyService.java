package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public int checkNull() {
        String str = "Hello Spring Boot!";
        return str.length();
    }
}
