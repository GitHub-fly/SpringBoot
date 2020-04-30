package com.soft1851.springbootmybatisplus.mapper;

import com.soft1851.springbootmybatisplus.entity.Music;
import com.soft1851.springbootmybatisplus.model.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xunmi
 * @ClassName UserMapperTest
 * @Description TODO
 * @Date 2020/4/16
 * @Version 1.0
 **/
@SpringBootTest
public class UserMapperTest {
    @Resource
    private SysUserMapper userMapper;

    @Test
    public void test() {
        System.out.println(userMapper.getPermissionByUserId("fcc18def-399c-4c8c-aa03-bbfa0c7c"));
    }
}
