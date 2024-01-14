package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Hello");
    }


    @Test
    @RepeatedTest(5)
    @DisplayName("第一次测试")
    public void firstTest() {
        System.out.println("hello world");
    }


    @BeforeEach
    public void beforeTest() {
        System.out.println("测试开始了");
    }


    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("全部测试开始了");
    }

}
