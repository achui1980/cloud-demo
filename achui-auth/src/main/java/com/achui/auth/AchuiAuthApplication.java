package com.achui.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author portz
 * @date 2020/4/1 21:18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AchuiAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AchuiAuthApplication.class, args);
    }
}
