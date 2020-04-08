package com.achui.common.handler;

import com.achui.common.entity.AchuiResponse;
import com.achui.common.exception.AchuiAuthException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author portz
 * @date 2020/4/8 22:05
 */
@Slf4j
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public AchuiResponse handleException(Exception e) {
        log.error("系统内部异常，异常信息", e);
        return new AchuiResponse().message("系统内部异常");
    }

    @ExceptionHandler(value = AchuiAuthException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public AchuiResponse handleFebsAuthException(AchuiAuthException e) {
        log.error("系统错误", e);
        return new AchuiResponse().message(e.getMessage());
    }

    @ExceptionHandler(value = AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public AchuiResponse handleAccessDeniedException(){
        return new AchuiResponse().message("没有权限访问该资源");
    }
}
