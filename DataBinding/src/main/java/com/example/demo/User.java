package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {

    private int id;
    private String name;
    private int age;

    User(int id) {
        this.id = id;
    }
}