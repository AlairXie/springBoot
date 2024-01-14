package com.example.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author xieyunpeng
 * @create 2024/1/13
 */
@SpringBootTest
@DisplayName("断言测试类/参数化测试")
public class AssertTest {
    @Test
    @DisplayName("断言测试类")
    void testAssertion(){
        int cal = cal(1, 2);
        Assertions.assertEquals(5,cal);
    }

    int cal(int i ,int j){
        return i + j;
    }

    @ParameterizedTest
    @DisplayName("参数化测试")
    @ValueSource(ints = {1,2,3,6,4,7,8})
    public void testParameter(int i ){
        System.out.println(i);
    }





}
