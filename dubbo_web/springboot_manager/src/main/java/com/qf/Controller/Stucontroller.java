package com.qf.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.Student;
import com.qf.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 靓仔
 * @date 2019/11/30 9:24
 */
@Controller
@RequestMapping("/stu")
public class Stucontroller {
    @Reference
    private StuService stuService;
/**
 * 功能描述: 查询班级
 * @Author: 深圳最靓的仔
 * @Param: [model]
 * @Return: java.lang.String
 * @Date: 2019/11/30 15:03
*/
    @RequestMapping("/list")
    public String list(Model model){
        List<Student>list =stuService.list();
        System.out.println(list);
        model.addAttribute("stu",list);
        return "stulist";
    }
    /**
     * 功能描述: 跳转到添加页面
     * @Author: 深圳最靓的仔
     * @Param: []
     * @Return: java.lang.String
     * @Date: 2019/11/30 15:03
    */
    @RequestMapping("/add")
    public String list( ){
        return "stuadd";
    }
    /**
     * 功能描述: 添加学生
     * @Author: 深圳最靓的仔
     * @Param: [student]
     * @Return: java.lang.String
     * @Date: 2019/11/30 15:03
    */
    @RequestMapping("/insert")
    public String insert(Student student){
         stuService.insert(student);
        return "redirect:http://localhost:8090/stu/list";
    }
    /**
     * 功能描述: 跳转首页
     * @Author: 深圳最靓的仔
     * @Param: []
     * @Return: java.lang.String
     * @Date: 2019/11/30 15:03
    */
    @RequestMapping("/index")
    public String index( ){
        return "index";
    }
    /**
     * 功能描述: 删除
     * @Author: 深圳最靓的仔
     * @Param: [id]
     * @Return: java.lang.String
     * @Date: 2019/11/30 15:03
    */
    @RequestMapping("/del")
    public String del(Integer id){
        stuService.del(id);
        return "redirect:http://localhost:8090/stu/list";
    }
    /**
     * 功能描述: <br>
     * @Author: 深圳最靓的仔 
     * @Param: 
     * @Return:  
     * @Date: 2019/11/30 16:49
    */
    /**
     * 功能描述: 修改
     * @Author: 深圳最靓的仔
     * @Param: [id]
     * @Return: java.lang.String
     * @Date: 2019/11/30 15:03
    */
    @RequestMapping("/upd")
    public String ud(Integer id,Model model){
       Student student=stuService.Byid(id);
        model.addAttribute("stu",student);
        return "update";
        /**
         * 功能描述: <br>
         * @Author: 深圳最靓的仔 
         * @Param: [id, model]
         * @Return: java.lang.String 
         * @Date: 2019/11/30 17:11
        */
        /**
         * 功能描述: <br>
         * @Author: 深圳最靓的仔 
         * @Param: [id, model]
         * @Return: java.lang.String 
         * @Date: 2019/11/30 17:10
        */
    }
}
