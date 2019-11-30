package com.qf.service;

import com.qf.Student;

import java.util.List;

/**
 * @author 靓仔
 * @date 2019/11/30 9:47
 */
public interface StuService {
     List<Student>list();

    void insert(Student student);

    void del(Integer id);

    void ud(Student student);

    Student Byid(Integer id);
}
