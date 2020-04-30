package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.ControllerWebLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author xunmi
 * @ClassName HelloController
 * @Description TODO
 * @Date 2020/4/9
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/")
@Slf4j
public class HelloController {
    /**
     * 采用自定的 WebLog 日志注解，记录调用的接口方法名，是否需要持久化
     *
     * @param arg1
     * @param arg2
     * @return String
     */
    @RequestMapping(value = "hello")
    @ControllerWebLog(name = "getHello", isSaved = true)
    public String getHello(String arg1, int arg2) {
        log.info("控制层获得参数：" + arg1);
        log.info("控制层获得参数：" + arg2);
        // 休眠，模拟接口耗时
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello Spring boot";
    }


    @RequestMapping(value = "hello-mock-mvc")
    public String hello(String name) {
        return "Hello " + name;
    }


    @RequestMapping(value = "hello-mock-mvc-header")
    public String hi(String name, HttpServletRequest request) {
        String header = "soft1851";
        String headerText = request.getHeader("user-Agent");
        Cookie[] cookies = request.getCookies();

        if (cookies == null) {
            return name + ", please log in.";
        }

        if (headerText.equals(header)) {
            return "Hello " + name;
        } else {
            return name + ", here is the soft1851.";
        }

    }
}
