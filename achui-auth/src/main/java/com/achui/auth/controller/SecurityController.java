package com.achui.auth.controller;

import com.achui.common.entity.AchuiResponse;
import com.achui.common.exception.AchuiAuthException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * @author portz
 * @date 2020/4/1 22:25
 */
@RestController
public class SecurityController {
    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    @GetMapping("oauth/test")
    public String testOauth() {
        return "oauth";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @DeleteMapping("signout")
    public AchuiResponse signout(HttpServletRequest request) throws AchuiAuthException {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
        AchuiResponse febsResponse = new AchuiResponse();
        if (!consumerTokenServices.revokeToken(token)) {
            throw new AchuiAuthException("退出登录失败");
        }
        return febsResponse.message("退出登录成功");
    }
}
