package com.qf.springboot_classes;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
@DubboComponentScan("com.qf.serviceImpl")
public class SpringbootClassesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootClassesApplication.class, args);
    }

}
