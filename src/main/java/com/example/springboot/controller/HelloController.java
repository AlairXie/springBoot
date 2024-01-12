package com.example.springboot.controller;

import com.example.springboot.Entity.Car;
import com.example.springboot.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @Autowired
    JdbcTemplate jdbcTemplate;

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

//    @ResponseBody
    @GetMapping("/sql")
    public String sql(){
        String sql = "SELECT count(*) FROM SG_CON_PWRGRID_B";
        Long count = jdbcTemplate.queryForObject(sql,Long.class);
        return String.valueOf(count);
    }


}
