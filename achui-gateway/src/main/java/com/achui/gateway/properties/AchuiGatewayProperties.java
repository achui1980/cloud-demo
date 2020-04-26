package com.achui.gateway.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author portz
 * @date 2020/4/26 14:48
 */
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:achui-gateway.properties"})
@ConfigurationProperties(prefix = "achui.gateway")
public class AchuiGatewayProperties  {
    /**
     * 禁止外部访问的 URI，多个值的话以逗号分隔
     */
    private String forbidRequestUri;
}
