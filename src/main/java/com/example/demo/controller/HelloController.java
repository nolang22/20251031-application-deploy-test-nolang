package com.example.demo.controller;

import com.example.demo.service.DummyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final DummyService dummyService;

    @GetMapping("/hi")
    public int hello() {
        return dummyService.checkNull();
    }
}
