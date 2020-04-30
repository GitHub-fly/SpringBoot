package com.soft1851.spring.checkout.annotation;

import com.soft1851.spring.checkout.validator.PhoneNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

/**
 * @author xunmi
 * @ClassName PhoneNumber
 * @Description TODO
 * @Date 2020/4/30
 * @Version 1.0
 **/
@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneNumberValidator.class)
@Documented
public @interface PhoneNumber {
    String message() default "phone 电话号码有误";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
