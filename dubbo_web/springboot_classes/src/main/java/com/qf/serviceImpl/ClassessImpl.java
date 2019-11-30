package com.qf.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.Classess;
import com.qf.dao.ClassesMapper;
import com.qf.service.ClaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 靓仔
 * @date 2019/11/30 9:57
 */
@Service
public class ClassessImpl implements ClaService {

    @Autowired
    private ClassesMapper classesMapper;
    @Override
    public List<Classess> list() {
        return classesMapper.selectList(null);
    }
    @Override
    public Classess Byid(Integer id){
        return classesMapper.selectById(id);
    }
}
