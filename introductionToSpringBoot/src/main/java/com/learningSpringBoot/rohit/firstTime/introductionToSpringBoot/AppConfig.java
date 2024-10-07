package com.learningSpringBoot.rohit.firstTime.introductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Apple getObj() {
        return new Apple();
    }
}
