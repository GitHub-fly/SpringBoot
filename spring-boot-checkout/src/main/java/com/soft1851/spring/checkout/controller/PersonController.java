package com.soft1851.spring.checkout.controller;

import com.soft1851.spring.checkout.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * @author xunmi
 * @ClassName PersonController
 * @Description 使用Spring框架自带的ResponseEntity作为返回值
 * @Date 2020/4/30
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api")
@Validated
@Slf4j
public class PersonController {

    @PostMapping("/person")
    public ResponseEntity<Person> savePerson(@RequestBody @Valid Person person) {
        log.info("入参对象：" + person);
        return ResponseEntity.ok().body(person);
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<Integer> getPersonById(@Valid @PathVariable("id") @Min(value = 10, message = "id不能小于10") Integer id) {
        return ResponseEntity.ok().body(id);
    }

    @PutMapping("/person")
    public ResponseEntity<String> getPersonByName(@Valid @RequestParam("name") @Size(max = 10, message = "name长度超出范围") String name) {
        return ResponseEntity.ok().body(name);
    }
}
