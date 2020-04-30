package com.soft1851.springboot.aop.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * @author xunmi
 * @ClassName RoleMapper
 * @Description TODO
 * @Date 2020/4/14
 * @Version 1.0
 **/
public interface RoleMapper {
    /**
     * 根据角色id查询角色
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM sys_role WHERE id=#{id}")
    Map<String, Object> getRoleById(int id);
}
