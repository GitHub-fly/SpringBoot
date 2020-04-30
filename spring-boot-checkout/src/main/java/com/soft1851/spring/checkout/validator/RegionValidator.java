package com.soft1851.spring.checkout.validator;

import com.soft1851.spring.checkout.annotation.Region;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;
import java.util.HashSet;

/**
 * @author xunmi
 * @ClassName RegionValidator
 * @Description TODO
 * @Date 2020/4/30
 * @Version 1.0
 **/
public class RegionValidator implements ConstraintValidator<Region, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        HashSet<Object> regions = new HashSet<>();
        regions.add("China");
        regions.add("China-Taiwan");
        regions.add("China-HongKong");
        return regions.contains(value);
    }
}
