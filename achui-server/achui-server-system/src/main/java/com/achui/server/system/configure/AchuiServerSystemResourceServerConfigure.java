package com.achui.server.system.configure;

import com.achui.common.handler.AchuiAccessDeniedHandler;
import com.achui.common.handler.AchuiAuthExceptionEntryPoint;
import com.achui.server.system.properties.AchuiServerSystemProperties;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @author portz
 * @date 2020/4/3 18:29
 */
@Configuration
@EnableResourceServer
public class AchuiServerSystemResourceServerConfigure extends ResourceServerConfigurerAdapter {
    @Autowired
    private AchuiAccessDeniedHandler accessDeniedHandler;
    @Autowired
    private AchuiAuthExceptionEntryPoint exceptionEntryPoint;
    @Autowired
    private AchuiServerSystemProperties properties;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        String[] anonUrls = StringUtils.splitByWholeSeparatorPreserveAllTokens(properties.getAnonUrl(), ",");
        http.csrf().disable()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/actuator/**").permitAll()
                .antMatchers(anonUrls).permitAll()
                .antMatchers("/**")
                .authenticated();
    }
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.authenticationEntryPoint(exceptionEntryPoint)
                .accessDeniedHandler(accessDeniedHandler);
    }
}
