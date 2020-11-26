package com.wwh.test.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 *
 */
@Configuration
@ConfigurationProperties(prefix = "spring.wwh.test")
public class WwProperties {
    private String aa;
    private String bb;

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }
}