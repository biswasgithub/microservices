package com.ijayakantha.springeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class SpringStudentClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringStudentClientApplication.class, args);
    }
}
