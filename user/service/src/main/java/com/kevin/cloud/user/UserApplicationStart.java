package com.kevin.cloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Kevin.xu
 */
@EnableEurekaClient
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = {"com.kevin.cloud.user", "com.kevin.cloud.user.repository", "com.kevin.cloud.config.repository"})
@SpringBootApplication
public class UserApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(UserApplicationStart.class, args);
    }
}


