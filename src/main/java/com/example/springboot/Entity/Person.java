package com.example.springboot.Entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author xieyunpeng
 * @create 2024/1/6
 */
@Data
@ConfigurationProperties(prefix = "person")
public class Person{
        private String userName;
        private Boolean boss;
        private Date birth;
        private Integer age;
        private Dog pet;
        private String[] interests;
        private List<String> animal;
        private Map<String, Object> score;
        private Set<Double> salarys;
        private Map<String, List<Dog>> allPets;
}
