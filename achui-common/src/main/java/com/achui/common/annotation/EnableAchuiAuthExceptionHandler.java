package com.achui.common.annotation;

import com.achui.common.configure.AchuiAuthExceptionConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AchuiAuthExceptionConfigure.class)
public @interface EnableAchuiAuthExceptionHandler {
}
