package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Singleton {

    @Autowired
    private Prototype prototype;

    public Prototype getPrototype() {
        return prototype;
    }
}