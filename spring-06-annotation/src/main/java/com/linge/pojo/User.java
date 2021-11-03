package com.linge.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class User {

    private String name;

    @Value("QQ")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
