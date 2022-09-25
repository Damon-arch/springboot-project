package com.sks;

import com.sks.config.SpringConfig;
import com.sks.vo.Student;
import com.sks.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testXML() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Student student = ctx.getBean("student", Student.class);
        System.out.println(student);
    }
    
    @Test
    public void testJavaConfig() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student1 = ctx.getBean("sks", Student.class);
        Student student2 = ctx.getBean("student", Student.class);
        System.out.println(student1);
        System.out.println(student2);
    }
    
    @Test
    public void testTiger() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = ctx.getBean("tiger", Tiger.class);
        System.out.println(tiger);
    }
}
