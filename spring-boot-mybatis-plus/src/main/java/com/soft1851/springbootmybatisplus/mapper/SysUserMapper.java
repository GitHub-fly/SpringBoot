package com.soft1851.springbootmybatisplus.mapper;

import com.soft1851.springbootmybatisplus.model.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author xunmi
 * @since 2020-04-16
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 通过id查找对该用户的所有权限功能
     *
     * @param id
     * @return
     */
    List<String> getPermissionByUserId(String id);
}
