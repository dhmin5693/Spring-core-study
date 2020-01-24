package com.example.demo;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void handler(Event event) {
//        System.out.println(Thread.currentThread().toString());
        System.out.println("Another handler : " + event.getData());
    }
}