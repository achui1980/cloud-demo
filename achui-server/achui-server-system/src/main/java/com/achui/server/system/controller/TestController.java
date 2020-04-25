package com.achui.server.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author portz
 * @date 2020/4/3 18:33
 */
@RestController
public class TestController {

    @GetMapping("info")
    public String test(){
        return "achui-server-system";
    }

    @GetMapping("currentUser")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @GetMapping("hello")
    public String hello(String name) {
        return "hello" + name;
    }
}
