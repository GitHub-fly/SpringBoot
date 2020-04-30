package com.soft1851.springboot.aop.entity;

import lombok.*;

/**
 * @author xunmi
 * @ClassName SysRole
 * @Description SysRole 实体类
 * @Date 2020-04-14 09:59:12
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class SysRole {

    private Integer id;
    /**
     * 名字
     */
    private String name;
    /**
     * 介绍
     */
    private String description;

}