package com.soft1851.springboot.aop.aspect;

import com.soft1851.springboot.aop.annotation.Jdbc;
import com.soft1851.springboot.aop.entity.Soft;
import com.soft1851.springboot.aop.util.ResponseObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xunmi
 * @ClassName JdbcAspect
 * @Description TODO
 * @Date 2020/4/13
 * @Version 1.0
 **/
@Aspect
@Component
@Slf4j
public class JdbcAspect {

    /**
     * 配置加上自定义注解的方法为切点
     *
     * @param jdbc
     */
    @Pointcut("@annotation(jdbc)")
    public void doJdbc(Jdbc jdbc) {
    }

    @Around(value = "doJdbc(jdbc)", argNames = "pjp, jdbc")
    public Object doAround(ProceedingJoinPoint pjp, Jdbc jdbc) throws Throwable {
        ResponseObject ro = new ResponseObject();
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert sra != null;
        HttpServletRequest request = sra.getRequest();
        // 取得注解中的 clazz 的值
        String[] clazz = jdbc.clazz();
        System.out.println(clazz[0]);
        // 先判断是否登录
        if (request.getHeader("id") == null) {
            ro.setCode(405);
            ro.setMsg("请先登录");
            return ro;
        } else {
            // 验证身份
            String clazzText = request.getHeader("clazz");
            log.info(clazzText);
            System.out.println(clazzText);
            // 遍历 clazzText 数组，匹配 clazz
            for (String clazzName : clazz) {
                if (clazzName.equals(clazzText)) {
                    // 身份匹配成功，调用目标方法
                    return pjp.proceed();
                }
            }
            ro.setCode(403);
            ro.setMsg("enmmm, 您好像走错了班级！");
            return ro;
        }
    }
}
