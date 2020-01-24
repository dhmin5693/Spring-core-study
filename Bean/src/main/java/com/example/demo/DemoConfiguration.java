package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    @Bean
    public DemoRepository demoRepository() {
        return new DemoRepository();
    }

    @Bean
    public DemoService demoService(DemoRepository demoRepository) {
        return new DemoService(demoRepository);
    }
}
