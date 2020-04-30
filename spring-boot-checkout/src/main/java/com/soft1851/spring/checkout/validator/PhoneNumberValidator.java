package com.soft1851.spring.checkout.validator;

import com.soft1851.spring.checkout.annotation.PhoneNumber;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.*;

/**
 * @author xunmi
 * @ClassName PhoneNumberValidator
 * @Description TODO
 * @Date 2020/4/30
 * @Version 1.0
 **/
public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        Pattern pattern = compile("^((13[0-9])|(14[5-8])|(15([0-3]|[5-9]))|(16[6])|(17[0|4|6|7|8])|(18[0-9])|(19[8-9]))\\d{8}$");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
