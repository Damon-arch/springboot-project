package com.sks.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tiger")
public class Tiger {
    @Value("${tiger.age}")
    private Integer age;
    @Value("${tiger.name}")
    private String name;
    
    @Override
    public String toString() {
        return "Tiger{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
