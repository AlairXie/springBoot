package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xieyunpeng
 * @create 2024/1/6
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "hello Spring Boot！";
    }
}
