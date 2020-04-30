package com.soft1851.spring.mbp.entity;

import lombok.*;

/**
 * @author xunmi
 * @ClassName TRole
 * @Description TRole 实体类
 * @Date 2020-04-16 09:59:25
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class TRole {

    private Integer id;

    private String role;

    private String canDo;

}