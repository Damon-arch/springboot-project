package com.sks.service.impl;

import com.sks.dao.StudentDao;
import com.sks.po.Student;
import com.sks.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryStudent(Integer id) {
        return studentDao.selectById(id);
    }
}
