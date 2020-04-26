package com.achui.monitor.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AchuiMonitorAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AchuiMonitorAdminApplication.class, args);
    }

}
