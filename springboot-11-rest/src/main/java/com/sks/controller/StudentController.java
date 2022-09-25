package com.sks.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping("/student/{stuId}")
    public String getStudent(@PathVariable("stuId") Integer id) {
        return id.toString();
    }
    
    @PostMapping("/student/{name}/{age}")
    public String insertStudent(@PathVariable("name") String stuName,
                                @PathVariable("age") Integer age) {
        return "添加的学生为：" + stuName + age;
    }
    
    @PutMapping("/stu/{haha}")
    public String update(@PathVariable("haha") String haha) {
        return haha;
    }
}
