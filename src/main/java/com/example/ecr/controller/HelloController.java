package com.example.ecr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//push

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String sayHi() {
        return "Hi";
    }
}
