package com.example.springboot;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Junit5功能测试类")
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
