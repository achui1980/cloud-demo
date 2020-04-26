package com.achui.server.system;

import com.achui.common.annotation.EnableAchuiAuthExceptionHandler;
import com.achui.common.annotation.EnableAchuiServerProtect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableAchuiAuthExceptionHandler
@EnableAchuiServerProtect
@EnableTransactionManagement
@MapperScan("com.achui.server.system.mapper")
public class AchuiServerSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AchuiServerSystemApplication.class, args);
	}

}
