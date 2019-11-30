package com.qf.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.Classess;
import com.qf.service.ClaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 靓仔
 * @date 2019/11/30 9:24
 */
@Controller
@RequestMapping("/cla")
public class Clacontroller {

  @Reference
    private ClaService claService;

  @RequestMapping("/list")
   public  String list(Model model){
       List<Classess>list=claService.list();
      model.addAttribute("cla",list);
       return "clalist";
  }
}
