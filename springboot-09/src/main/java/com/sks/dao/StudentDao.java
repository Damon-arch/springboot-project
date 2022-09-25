package com.sks.dao;

import com.sks.po.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 告诉 mybatis 这是 Dao 接口，创建此接口的代理对象
 */
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}
