package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevProfile {

    @Bean(name = "myProfile")
    public String myProfile() {
        return "DEV";
    }
}