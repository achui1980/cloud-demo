package com.achui.auth;

import com.achui.common.annotation.EnableAchuiAuthExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author portz
 * @date 2020/4/1 21:18
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAchuiAuthExceptionHandler
public class AchuiAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AchuiAuthApplication.class, args);
    }
}
