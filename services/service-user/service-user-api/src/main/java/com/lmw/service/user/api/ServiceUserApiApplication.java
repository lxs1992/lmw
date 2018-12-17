package com.lmw.service.user.api;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lmw.service.user.api.mapper")

public class ServiceUserApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApiApplication.class, args);
    }
}
