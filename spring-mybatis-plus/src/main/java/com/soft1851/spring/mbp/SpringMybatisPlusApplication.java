package com.soft1851.spring.mbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xunmi
 */
@SpringBootApplication
@MapperScan("com.spring1851.spring.mbp.mapper")
public class SpringMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisPlusApplication.class, args);
    }

}
