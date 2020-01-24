package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private DemoRepository beanRepository;

    public DemoService(DemoRepository beanRepository) {
        this.beanRepository = beanRepository;
    }
}
