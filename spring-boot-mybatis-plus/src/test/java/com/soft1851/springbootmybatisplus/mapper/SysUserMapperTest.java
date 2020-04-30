package com.soft1851.springbootmybatisplus.mapper;

import com.soft1851.springbootmybatisplus.entity.Music;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

@SpringBootTest
class SysUserMapperTest {

    @Resource
    private MusicMapper musicMapper;

    @Test
    public void getAll() {
        //无参查询
        List<Music> sysUsers = musicMapper.selectList(null);
        sysUsers.forEach(System.out::println);
    }

    @Test
    public void selectById() {
        System.out.println(musicMapper.selectById("2"));
    }


    @Test
    public void countUser() {

//        sysUserMapper.selectCount();
    }
}