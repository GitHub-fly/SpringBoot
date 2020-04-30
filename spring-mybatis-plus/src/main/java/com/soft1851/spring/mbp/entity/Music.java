package com.soft1851.spring.mbp.entity;

import java.util.Date;

import lombok.*;

/**
 * @author xunmi
 * @ClassName Music
 * @Description Music 实体类
 * @Date 2020-04-16 09:31:50
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Data
public class Music {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 歌名
     */
    private String name;
    /**
     * 歌手
     */
    private String author;
    /**
     * 歌曲链接
     */
    private String src;
    /**
     * 封面图
     */
    private String img;
    /**
     * 播放次数
     */
    private Integer count;
    /**
     * 歌曲类别
     */
    private String type;
    /**
     * 上架时间
     */
    private Date createTime;

}