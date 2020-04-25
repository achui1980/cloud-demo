package com.achui.server.system.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author portz
 * @date 2020/4/25 14:50
 */
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:achui-server-system.properties"})
@ConfigurationProperties(prefix = "achui.server.system")
public class AchuiServerSystemProperties {
    /**
     * 免认证 URI，多个值的话以逗号分隔
     */
    private String anonUrl;
    private AchuiSwaggerProperties swagger = new AchuiSwaggerProperties();
}
