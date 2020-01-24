package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestProfile {

    @Bean(name = "myProfile")
    public String myProfile() {
        return "TEST";
    }
}