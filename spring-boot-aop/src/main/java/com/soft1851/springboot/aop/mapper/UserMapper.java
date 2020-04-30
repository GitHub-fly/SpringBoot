package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.Soft;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author xunmi
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2020/4/14
 * @Version 1.0
 **/
public interface UserMapper {
    /**
     * 插入数据到 sys_user
     *
     * @return List<Soft>
     */
    @Select("INSERT INTO sys_user VALUES()")
    int[] batchInsert();

    /**
     * 根据id查询用户信息
     *
     * @param userId
     * @return
     */
    @Select("SELECT t1.*, t2.* " +
            "FROM sys_ur t3 " +
            "LEFT JOIN sys_user t1 " +
            "ON t1.user_id = t3.user_id " +
            "LEFT JOIN sys_role t2 " +
            "ON t2.role_id = t3.role_id " +
            "WHERE t3.user_id=#{userId}")
    Map<String, Object> getUserById(String userId);


}
