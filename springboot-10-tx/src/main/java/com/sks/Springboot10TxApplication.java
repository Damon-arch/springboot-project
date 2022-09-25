package com.sks;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.sks.dao")
public class Springboot10TxApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(Springboot10TxApplication.class, args);
    }
    
}
