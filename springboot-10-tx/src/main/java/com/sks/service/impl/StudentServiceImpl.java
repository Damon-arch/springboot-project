package com.sks.service.impl;

import com.sks.dao.StudentMapper;
import com.sks.model.Student;
import com.sks.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    
    @Override
    public int insert(Student student) {
        System.out.println("业务方法执行sql语句");
        int res = studentMapper.insert(student);
        int i = 1 / 0;
        int res2 = studentMapper.insert(student);
        return res + res2;
    }
}
