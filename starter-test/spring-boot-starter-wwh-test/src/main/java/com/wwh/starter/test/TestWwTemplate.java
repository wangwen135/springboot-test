package com.wwh.starter.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wwh.test.starter.WwTemplate;

@Component
public class TestWwTemplate {

    @Autowired
    private WwTemplate template;

    public void test1() {
        System.out.println(template.doSomething());
    }

    public void test2() {
        System.out.println(template.doAA());
    }

    public void test3() {
        System.out.println(template.doBB());
    }
}
