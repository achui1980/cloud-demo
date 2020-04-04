package com.achui.auth.properties;

import lombok.Data;

/**
 * @author portz
 * @date 2020/4/4 16:51
 */
@Data
public class AchuiClientsProperties {
    private String client;
    private String secret;
    private String grantType = "password,authorization_code,refresh_token";
    private String scope = "all";
}
