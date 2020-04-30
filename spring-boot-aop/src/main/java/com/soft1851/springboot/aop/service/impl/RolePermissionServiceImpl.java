package com.soft1851.springboot.aop.service.impl;

import com.soft1851.springboot.aop.mapper.PermissionMapper;
import com.soft1851.springboot.aop.mapper.RolePermissionMapper;
import com.soft1851.springboot.aop.service.RolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author xunmi
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Date 2020/4/14
 * @Version 1.0
 **/
@Service
public class RolePermissionServiceImpl implements RolePermissionService {
    @Resource
    private RolePermissionMapper mapper;
    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public List<Map<String, Object>> getAdminRolePermission() {
        return permissionMapper.getParentPermission();
    }

    @Override
    public List<Map<String, Object>> getRolePermissionBySysAdmin(String sysAdminId) {
        return mapper.getRoleById(sysAdminId);
    }
}
