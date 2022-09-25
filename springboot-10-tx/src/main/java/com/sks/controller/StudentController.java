package com.sks.controller;

import com.sks.model.Student;
import com.sks.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {
    @Resource
    private StudentService studentService;
    
    @RequestMapping("/addStudent")
    public String add(String name, Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        int rows = studentService.insert(student);
        return "添加学生：" + rows;
    }
}
