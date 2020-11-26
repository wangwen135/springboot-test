package com.wwh.test.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WwProperties.class)
public class WwTemplateAutoConfiguration {
    private WwProperties wwProperties;

    public WwTemplateAutoConfiguration(WwProperties wwProperties) {
        this.wwProperties = wwProperties;
    }

    @Bean
    public WwTemplate tBean() {
        return new WwTemplate(wwProperties);
    }
}
