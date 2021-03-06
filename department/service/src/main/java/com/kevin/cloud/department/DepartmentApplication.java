package com.kevin.cloud.department;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableEurekaClient
@EnableAutoConfiguration
@Configuration
@SpringBootApplication
@ComponentScan(basePackages = {"com.kevin.cloud.department","com.kevin.common.config"})
@EnableFeignClients(basePackages = {"com.kevin.cloud.department.service.client"})
@MapperScan(basePackages = "tk.mybatis.pagehelper")
public class DepartmentApplication {

  public static void main(String[] args) {
    SpringApplication.run(DepartmentApplication.class, args);
  }
}
