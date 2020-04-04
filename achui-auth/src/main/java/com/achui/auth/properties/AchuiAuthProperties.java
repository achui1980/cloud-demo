package com.achui.auth.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * @author portz
 * @date 2020/4/4 16:52
 */
@Data
@SpringBootConfiguration
@PropertySource(value = {"classpath:achui-auth.properties"})
@ConfigurationProperties(prefix = "achui.auth")
public class AchuiAuthProperties {
    private AchuiClientsProperties[] clients = {};
    private int accessTokenValiditySeconds = 60 * 60 * 24;
    private int refreshTokenValiditySeconds = 60 * 60 * 24 * 7;
}
