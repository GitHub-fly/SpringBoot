package com.soft1851.springboot.aop.entity;

import lombok.*;

/**
 * @author xunmi
 * @ClassName SysUr
 * @Description SysUr 实体类
 * @Date 2020-04-14 09:59:24
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class SysUr {
    private Integer id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 角色id
     */
    private Integer roleId;

}