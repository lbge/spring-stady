package com.linge;

import com.linge.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
