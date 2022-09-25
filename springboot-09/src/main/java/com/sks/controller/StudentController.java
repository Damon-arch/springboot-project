package com.sks.controller;

import com.sks.po.Student;
import com.sks.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    
    @RequestMapping("/student")
    @ResponseBody
    public String student(Integer id) {
        Student student = studentService.queryStudent(id);
        return student.toString();
    }
}
