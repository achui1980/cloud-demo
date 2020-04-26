package com.achui.server.test.configure;

import com.achui.common.handler.AchuiAccessDeniedHandler;
import com.achui.common.handler.AchuiAuthExceptionEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * @author portz
 * @date 2020/4/3 18:42
 */
@Configuration
@EnableResourceServer
public class AchuiServerTestResourceServerConfigure extends ResourceServerConfigurerAdapter {
    @Autowired
    private AchuiAccessDeniedHandler accessDeniedHandler;
    @Autowired
    private AchuiAuthExceptionEntryPoint exceptionEntryPoint;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests()
                .antMatchers("/actuator/**").permitAll()
                .antMatchers("/**")
                .authenticated();
    }
    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.authenticationEntryPoint(exceptionEntryPoint)
                .accessDeniedHandler(accessDeniedHandler);
    }
}
