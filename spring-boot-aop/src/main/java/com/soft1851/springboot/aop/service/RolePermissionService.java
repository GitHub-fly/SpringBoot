package com.soft1851.springboot.aop.service;

import java.util.List;
import java.util.Map;

/**
 * @author xunmi
 * @ClassName RolePermissionService
 * @Description TODO
 * @Date 2020/4/14
 * @Version 1.0
 **/
public interface RolePermissionService {
    /**
     * 查询超管权限
     *
     * @return
     */
    List<Map<String, Object>> getAdminRolePermission();

    /**
     * 查询系统管理员权限
     *
     * @param sysAdminId
     * @return List<Map < String, Object>>
     */
    List<Map<String, Object>> getRolePermissionBySysAdmin(String sysAdminId);
}
