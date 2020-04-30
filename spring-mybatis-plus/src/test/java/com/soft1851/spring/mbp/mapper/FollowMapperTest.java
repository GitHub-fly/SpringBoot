package com.soft1851.spring.mbp.mapper;

import com.soft1851.spring.mbp.entity.Music;
import com.soft1851.spring.mbp.entity.TFollower;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FollowMapperTest {
    @Resource
    private FollowMapper followMapper;

    @Test
    void testSelectAll() {
        // 无参查询
        List<TFollower> followers = followMapper.selectList(null);
        followers.forEach(System.out::println);
    }
}