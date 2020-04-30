package com.soft1851.spring.checkout.service;

import com.soft1851.spring.checkout.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;
import javax.validation.*;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonServiceTest {

    @Resource
    private PersonService personService;

    @Test()
    @ExceptionHandler(ConstraintViolationException.class)
    void validatePerson() {
        Person person = Person.builder()
                .id("123")
                .name("Soft1851")
                .age(11)
                .phone("11151999738")
                .email("Soft1851@qq.com")
                .sex("男")
                .build();
        personService.validatePerson(person);
    }

    @Test
    void checkManually() {
        // 通过 validator 工厂类获得的validator实例，也可以通过注入的方式
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Person person = new Person();
        person.setId("123");
        person.setSex("Man22");
        person.setEmail("abc");
        // 对参数进行校验，得到一组结果
        Set<ConstraintViolation<Person>> violations = validator.validate(person);
        for (ConstraintViolation<Person> constraintViolation : violations) {
            System.out.println(constraintViolation.getMessage());
        }
    }
}