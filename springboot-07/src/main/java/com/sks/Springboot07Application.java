package com.sks;

import com.sks.vo.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot07Application implements CommandLineRunner {
    
    public static void main(String[] args){
        System.out.println("before");
        ConfigurableApplicationContext context = SpringApplication.run(Springboot07Application.class, args);
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("哈哈");
    }
}
