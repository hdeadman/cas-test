package com.test.cas;

import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CasConfiguration {
    @Bean
    ThymeleafProperties thymeleafProperties() {
        return new ThymeleafProperties();
    }
}
