package com.achui.common.validator;

import com.achui.common.annotation.IsMobile;
import com.achui.common.entity.RegexpConstant;
import com.achui.common.utils.AchuiUtil;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author portz
 * @date 2020/4/24 20:27
 */
public class MobileValidator implements ConstraintValidator<IsMobile, String> {

    @Override
    public void initialize(IsMobile isMobile) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        try {
            if (StringUtils.isBlank(s)) {
                return true;
            } else {
                String regex = RegexpConstant.MOBILE_REG;
                return AchuiUtil.match(regex, s);
            }
        } catch (Exception e) {
            return false;
        }
    }
}
