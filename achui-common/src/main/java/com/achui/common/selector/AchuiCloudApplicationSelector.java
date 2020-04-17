package com.achui.common.selector;

import com.achui.common.configure.AchuiAuthExceptionConfigure;
import com.achui.common.configure.AchuiOAuth2FeignConfigure;
import com.achui.common.configure.AchuiServerProtectConfigure;
import com.achui.common.exception.AchuiAuthException;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author portz
 * @date 2020/4/15 23:47
 */
public class AchuiCloudApplicationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                AchuiAuthExceptionConfigure.class.getName(),
                AchuiOAuth2FeignConfigure.class.getName(),
                AchuiServerProtectConfigure.class.getName()
        };
    }
}
