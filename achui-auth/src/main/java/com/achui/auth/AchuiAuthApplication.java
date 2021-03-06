package com.achui.auth;

import com.achui.common.annotation.EnableAchuiAuthExceptionHandler;
import com.achui.common.annotation.EnableAchuiLettuceRedis;
import com.achui.common.annotation.EnableAchuiServerProtect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author portz
 * @date 2020/4/1 21:18
 */
@SpringBootApplication
@EnableAchuiAuthExceptionHandler
@EnableAchuiLettuceRedis
@EnableAchuiServerProtect
@MapperScan("com.achui.auth.mapper")
public class AchuiAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AchuiAuthApplication.class, args);
    }
}
