package com.soft1851.spring.mbp.entity;

import lombok.*;

/**
 * @author xunmi
 * @ClassName TFollower
 * @Description TFollower 实体类
 * @Date 2020-04-16 10:02:41
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class TFollower {
    /**
     * id
     */
    private String id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户主页链接
     */
    private String url;
    /**
     * 性别
     */
    private String gender;
    /**
     * 头像
     */
    private String avatarUrl;
    /**
     * 粉丝数
     */
    private String followerCount;

}