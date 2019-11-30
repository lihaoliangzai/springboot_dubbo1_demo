package com.qf.service;

import com.qf.Classess;

import java.util.List;

/**
 * @author 靓仔
 * @date 2019/11/30 9:47
 */
public interface ClaService {
     List<Classess>list();
     Classess Byid(Integer id);
}
