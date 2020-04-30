package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.AuthToken;
import com.soft1851.springboot.aop.annotation.Jdbc;
import com.soft1851.springboot.aop.entity.Soft;
import com.soft1851.springboot.aop.mapper.SoftMapper;
import com.soft1851.springboot.aop.util.ResponseObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xunmi
 * @ClassName JdbcController
 * @Description TODO
 * @Date 2020/4/13
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/")
@Slf4j
public class JdbcController {

    @Resource
    private SoftMapper softMapper;

    /**
     * 需要鉴权，此时该方法需要加注释，需要传角色
     * 角色可以传多个
     * 如果需要更复杂的逻辑操作，建议使用Spring Security、Apache、Shir安全框架
     *
     * @param name
     * @return
     */
    @GetMapping("clazz")
    @Jdbc(clazz = {"soft1851", "soft1813", "soft1821", "soft1831", "soft1841"})
    public ResponseObject clazz(String name) {
        if (name == null) {
            name = "";
        }
        log.info("clazz()方法需要鉴权,当前用户名:" + name);
        ResponseObject ro = new ResponseObject();
        ro.setCode(200);
        ro.setMsg(name + "您好，欢迎查看我班学生基本信息：");
        ro.setData(softMapper.selectAll());
        return ro;
    }
}
