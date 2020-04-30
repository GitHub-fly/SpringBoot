package com.soft1851.springboot.aop.entity;

import lombok.*;

/**
 * @author xunmi
 * @ClassName SysPermission
 * @Description SysPermission 实体类
 * @Date 2020-04-14 09:58:36
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class SysPermission {

    private Integer id;
    /**
     * 父级id
     */
    private Integer parentId;
    /**
     * 路由层级
     */
    private Integer type;
    /**
     * 文本内容
     */
    private String name;
    /**
     * 图标
     */
    private String icon;
    /**
     * 路径
     */
    private String path;

    private Integer ex1;

    private String ex2;

}