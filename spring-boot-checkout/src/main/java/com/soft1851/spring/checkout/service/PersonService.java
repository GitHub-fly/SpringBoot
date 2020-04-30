package com.soft1851.spring.checkout.service;

import com.soft1851.spring.checkout.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @author xunmi
 * @ClassName PersonService
 * @Description TODO
 * @Date 2020/4/30
 * @Version 1.0
 **/
@Service
@Validated
@Slf4j
public class PersonService {
    public void validatePerson(@Valid Person person) {
        log.info("service方式验证");
    }
}
