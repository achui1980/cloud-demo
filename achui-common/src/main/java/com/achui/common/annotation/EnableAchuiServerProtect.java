package com.achui.common.annotation;

import com.achui.common.configure.AchuiServerProtectConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author portz
 * @date 2020/4/14 22:46
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AchuiServerProtectConfigure.class)
public @interface EnableAchuiServerProtect {
}
