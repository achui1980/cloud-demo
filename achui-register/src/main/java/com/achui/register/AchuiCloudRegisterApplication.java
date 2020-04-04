package com.achui.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AchuiCloudRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AchuiCloudRegisterApplication.class, args);
	}

}
