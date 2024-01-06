package com.example.springboot.config;

import com.example.springboot.Entity.Dog;
import com.example.springboot.Entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xieyunpeng
 * @create 2024/1/6
 */
@Configuration(proxyBeanMethods = true)
public class BeanConfig {

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Person person(){
        return new Person();
    }

}
