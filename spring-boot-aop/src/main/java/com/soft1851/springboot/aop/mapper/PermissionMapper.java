package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.SysPermission;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author xunmi
 * @ClassName PermissionMapper
 * @Description TODO
 * @Date 2020/4/14
 * @Version 1.0
 **/
public interface PermissionMapper {
    /**
     * 根据资源id查询
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM sys_permission WHERE id=#{id}")
    SysPermission getPermissionById(String id);

    /**
     * 根据资源id查询资源及子类资源
     *
     * @param id
     * @return
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "subList", column = "id",
                    many = @Many(select = "com.soft1851.springboot.aop.mapper.PermissionMapper.getPermissionByParentId")),
    })
    @Select("SELECT * FROM sys_permission WHERE id=#{id}")
    Map<String, Object> getChildPermissionById(String id);

    /**
     * 获取页面资源及其所拥有的子类资源
     *
     * @return
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "subList", column = "id",
                    many = @Many(select = "com.soft1851.springboot.aop.mapper.PermissionMapper.getPermissionByParentId")),
    })
    @Select("SELECT * FROM sys_permission")
    List<Map<String, Object>> getParentPermission();

    /**
     * 根据父类id查询子类资源
     *
     * @param parentId
     * @return
     */
    @Results({
            @Result(property = "p_id", column = "p_id"),
            @Result(property = "subList", column = "p_id",
                    one = @One(select = "com.soft1851.springboot.aop.mapper.SysPermissionMapper.getPermissionByParentId")),
    })
    @Select("SELECT * FROM sys_permission WHERE parent_id=#{parentId}")
    List<Map<String, Object>> getPermissionByParentId(int parentId);

}
