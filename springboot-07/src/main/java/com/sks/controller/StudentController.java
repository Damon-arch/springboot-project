package com.sks.controller;

import com.sks.vo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class StudentController {
    @Resource
    private Student student;
    
    @RequestMapping("/student")
    public String student() {
        return student.toString();
    }
    
    @RequestMapping("/login")
    public String login() {
        return "登录成功";
    }
    
    @RequestMapping("/other")
    public String other() {
        return "其他";
    }
}
