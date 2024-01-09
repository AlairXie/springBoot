package com.example.springboot;

import com.example.springboot.Entity.Car;
import com.example.springboot.Entity.Dog;
import com.example.springboot.Entity.Person;
import com.example.springboot.config.BeanConfig;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {


        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Dog dog = run.getBean("dog", Dog.class);
        Dog dog02 = run.getBean("dog", Dog.class);
        System.out.println("组件：" +( dog==dog02));


        BeanConfig bean = run.getBean(BeanConfig.class);
        System.out.println("增强代理" + bean);

        Person person01 = bean.person();
        Person person02 = bean.person();
        System.out.println(person01==person02);



    }

}
