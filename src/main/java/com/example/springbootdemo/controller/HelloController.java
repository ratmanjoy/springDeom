package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Generated;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String helloController(){
        System.out.println("helloController...");
        return "ok";
    }
}
