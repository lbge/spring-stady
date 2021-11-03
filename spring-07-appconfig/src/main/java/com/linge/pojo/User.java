package com.linge.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {

    @Value("Test")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
