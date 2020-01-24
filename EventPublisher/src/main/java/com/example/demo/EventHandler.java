package com.example.demo;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void handler(Event event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("Event data : " + event.getData());
    }

    @EventListener
    public void handler(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
    }

    @EventListener
    public void handler(ContextClosedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
    }
}