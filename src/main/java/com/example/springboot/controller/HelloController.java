package com.example.springboot.controller;

import com.example.springboot.Entity.Car;
import com.example.springboot.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xieyunpeng
 * @create 2024/1/6
 */
@RestController
public class HelloController {
    @Autowired
    Car car;

    @Autowired
    Person person;

    @GetMapping("/")
    public String hello(){
        return "hello Spring Boot！";
    }


    @GetMapping("/car")
    public Car car(){
        return car;
    }


    @GetMapping("/person")
    public Person person(){
        return person;
    }


}
