package com.sks.config;

import com.sks.vo.Student;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:beans.xml")
@PropertySource("classpath:config.properties")
@ComponentScan("com.sks.vo")
public class SpringConfig {
    @Bean("sks")
    public Student student() {
        Student student = new Student();
        student.setAge(11);
        student.setName("sks");
        return student;
    }
}
