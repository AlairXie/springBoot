package com.example.springboot.Entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author xieyunpeng
 * @Date 2024/1/8 20:28
 */
@Component
@ConfigurationProperties(prefix = "car")
@Data
public class Car {
    private String type;
    private String money;
}
