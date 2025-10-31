package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public void checkNull() throws NullPointerException{
        String str = null;
        System.out.println(str.length());
    }
}