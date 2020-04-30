package com.soft1851.spring.mbp.mapper;

import com.soft1851.spring.mbp.entity.Music;
import com.soft1851.spring.mbp.entity.TRole;
import org.apache.catalina.mbeans.RoleMBean;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

import java.util.List;

@SpringBootApplication
class MusicMapperTest {
    @Resource
    private MusicMapper musicMapper;

    @Resource
    private RoleMapper roleMapper;

    @Test
    void testSelectAll() {
        // 无参查询
        List<Music> music = musicMapper.selectList(null);
        music.forEach(System.out::println);
    }

    @Test
    void testSelect() {
        // 无参查询
        List<TRole> roles = roleMapper.selectList(null);
        roles.forEach(System.out::println);
    }
}