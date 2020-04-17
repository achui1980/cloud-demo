package com.achui.common.annotation;

import com.achui.common.selector.AchuiCloudApplicationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author portz
 * @date 2020/4/15 23:49
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AchuiCloudApplicationSelector.class)
public @interface AchuiCloudApplication {
}
