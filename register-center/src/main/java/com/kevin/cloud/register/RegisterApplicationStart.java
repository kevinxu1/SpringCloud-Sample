package com.kevin.cloud.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Kevin.xu
 * 注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(RegisterApplicationStart.class, args);
    }
}
