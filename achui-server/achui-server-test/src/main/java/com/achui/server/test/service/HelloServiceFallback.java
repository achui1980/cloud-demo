package com.achui.server.test.service;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author portz
 * @date 2020/4/8 23:01
 */
@Slf4j
@Component
public class HelloServiceFallback implements FallbackFactory<IHelloService> {
    @Override
    public IHelloService create(Throwable throwable) {
        return name -> {
            log.error("调用febs-server-system服务出错", throwable);
            return "调用出错";
        };
    }
}
