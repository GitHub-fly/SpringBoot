package com.soft1851.springboot.aop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class SpringBootAopApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void addUser() {
        for (int i = 0; i < 4; i++) {
            System.out.println(UUID.randomUUID());
        }
    }

}
