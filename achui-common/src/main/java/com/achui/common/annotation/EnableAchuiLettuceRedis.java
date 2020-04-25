package com.achui.common.annotation;

import com.achui.common.configure.AchuiLettuceRedisConfigure;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author portz
 * @date 2020/4/23 17:34
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AchuiLettuceRedisConfigure.class)
public @interface EnableAchuiLettuceRedis {
}
