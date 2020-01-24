package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired Singleton singleton;

    @Autowired Prototype prototype;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(singleton);
        System.out.println(singleton);

        System.out.println(singleton.getPrototype());
        System.out.println(singleton.getPrototype());
    }
}