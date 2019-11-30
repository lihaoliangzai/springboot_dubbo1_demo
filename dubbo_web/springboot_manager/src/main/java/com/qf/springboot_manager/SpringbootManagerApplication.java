package com.qf.springboot_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
public class SpringbootManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootManagerApplication.class, args);
    }

}
