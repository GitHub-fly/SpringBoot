package com.soft1851.springboot.aop.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author xunmi
 * @ClassName RolePermissionMapper
 * @Description TODO
 * @Date 2020/4/14
 * @Version 1.0
 **/
public interface RolePermissionMapper {
    /**
     * 根据角色id查询角色
     *
     * @param id
     * @return
     */
    @Results({
            @Result(property = "permission", column = "permission_id",
                    one = @One(select = "com.soft1851.springboot.aop.mapper.PermissionMapper.getChildPermissionById")),
    })
    @Select("SELECT * FROM sys_rp WHERE role_id=#{id}")
    List<Map<String, Object>> getRoleById(String id);
}
