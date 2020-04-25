package com.achui.server.system.properties;

import lombok.Data;

/**
 * @author portz
 * @date 2020/4/25 14:48
 */
@Data
public class AchuiSwaggerProperties {
    private String basePackage;
    private String title;
    private String description;
    private String version;
    private String author;
    private String url;
    private String email;
    private String license;
    private String licenseUrl;
    private String grantUrl;
    private String name;
    private String scope;
}
