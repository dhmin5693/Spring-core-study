package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class User {

    @NotEmpty
    private String id;
    private String name;

    @Min(1)
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}