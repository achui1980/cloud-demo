package com.achui.server.test;

import com.achui.common.annotation.EnableAchuiAuthExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableDiscoveryClient
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableAchuiAuthExceptionHandler
@EnableFeignClients
public class AchuiServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AchuiServerTestApplication.class, args);
	}

}
