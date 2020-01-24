package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CrudService implements CrudManager {

    @Clock
    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void read() {
        System.out.println("read");
    }

    @Clock
    @Override
    public void update() {
        System.out.println("publish");
    }

    @Clock
    @Override
    public void delete() {
        System.out.println("delete");
    }
}