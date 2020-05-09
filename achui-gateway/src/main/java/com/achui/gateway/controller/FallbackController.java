package com.achui.gateway.controller;

import com.achui.common.entity.AchuiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author portz
 * @date 2020/5/6 14:36
 */
@RestController
@Slf4j
public class FallbackController {
    @RequestMapping("fallback/{name}")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Mono<AchuiResponse> systemFallback(@PathVariable String name) {
        log.info("=================invoke {}", name);
        String response = String.format("网关 - 访问%s超时或者服务不可用", name);
        return Mono.just(new AchuiResponse().message(response));
    }
}
