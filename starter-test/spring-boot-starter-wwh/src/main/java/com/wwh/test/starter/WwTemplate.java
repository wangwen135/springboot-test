package com.wwh.test.starter;

public class WwTemplate {

    private WwProperties wwProperties;

    public WwTemplate(WwProperties wwProperties) {
        this.wwProperties = wwProperties;
    }

    public String doSomething() {
        return "xxxx";
    }

    public String doAA() {
        return wwProperties.getAa();
    }

    public String doBB() {
        return wwProperties.getBb();
    }

}
