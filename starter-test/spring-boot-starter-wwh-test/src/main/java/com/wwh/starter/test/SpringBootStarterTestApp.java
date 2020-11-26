package com.wwh.starter.test;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootStarterTestApp {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext caContext = SpringApplication.run(SpringBootStarterTestApp.class, args);
        System.out.println("开始。。。。");
        TestWwTemplate wwTemplate = caContext.getBean(TestWwTemplate.class);
        // 这个bean中注入了starter自动配置的template
        wwTemplate.test1();
        wwTemplate.test2();
        wwTemplate.test3();
        System.out.println("结束");
    }
}
