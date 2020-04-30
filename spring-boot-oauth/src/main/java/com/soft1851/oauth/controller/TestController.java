package com.soft1851.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xunmi
 * @ClassName TestController
 * @Description TODO
 * @Date 2020/4/29
 * @Version 1.0
 **/
@RestController
public class TestController {
    @RequestMapping("/index")
    public String simpleIndex() {
        return "index";
    }
}
