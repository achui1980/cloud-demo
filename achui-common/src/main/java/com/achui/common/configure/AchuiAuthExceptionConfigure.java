package com.achui.common.configure;

import com.achui.common.handler.AchuiAccessDeniedHandler;
import com.achui.common.handler.AchuiAuthExceptionEntryPoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

public class AchuiAuthExceptionConfigure {
    @Bean
    @ConditionalOnMissingBean(name = "accessDeniedHandler")
    public AchuiAccessDeniedHandler accessDeniedHandler() {
        return new AchuiAccessDeniedHandler();
    }

    @Bean
    @ConditionalOnMissingBean(name = "authenticationEntryPoint")
    public AchuiAuthExceptionEntryPoint authenticationEntryPoint() {
        return new AchuiAuthExceptionEntryPoint();
    }
}
