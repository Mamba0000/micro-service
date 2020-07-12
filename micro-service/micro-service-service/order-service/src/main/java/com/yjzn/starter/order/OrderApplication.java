package com.yjzn.starter.order;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@EnableDiscoveryClient // 注册到nacos 要使用
public class OrderApplication  {



    //加main 方法就可以运行了
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}

