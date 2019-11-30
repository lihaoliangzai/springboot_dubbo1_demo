package com.qf.serviceImpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.Classess;
import com.qf.Student;
import com.qf.dao.StudentMapper;
import com.qf.service.ClaService;
import com.qf.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 靓仔
 * @date 2019/11/30 9:22
 */
@Service
public class StuImpl  implements StuService {
    @Autowired
    private StudentMapper studentMapper;

    @Reference
    private ClaService claService;
    @Override
    public List<Student> list() {
        List<Student> list = studentMapper.selectList(null);
        for(Student student:list){
            Integer cid = student.getCid();
            System.out.println(cid);
            Classess byid = claService.Byid(cid);
            student.setC(byid);
            System.out.println(list);
        }
        return list;
    }

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void del(Integer id) {
        studentMapper.deleteById(id);
    }

    @Override
    public void ud(Student student) {
        studentMapper.updateById(student);
    }

    @Override
    public Student Byid(Integer id) {
        return studentMapper.selectById(id);
    }
}
