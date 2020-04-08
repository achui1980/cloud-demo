package com.achui.server.test.service;

import com.achui.common.entity.AchuiServerConstant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author portz
 * @date 2020/4/8 22:56
 */
@FeignClient(value = AchuiServerConstant.ACHUI_SERVER_SYSTEM, contextId = "helloServiceClient", fallbackFactory = HelloServiceFallback.class)
public interface IHelloService {
    @GetMapping("hello")
    String hello(@RequestParam("name") String name);
}
