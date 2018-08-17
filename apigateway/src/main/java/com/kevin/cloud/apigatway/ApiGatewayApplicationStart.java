package com.kevin.cloud.apigatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Kevin.xu
 * @date 2018/8/9/3:08
 * @description :Cloud 服务网关
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApiGatewayApplicationStart {

  public static void main(String[] args) {
    SpringApplication.run(ApiGatewayApplicationStart.class, args);

  }

}
