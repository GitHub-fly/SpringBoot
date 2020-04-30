package com.soft1851.springboot.aop.mapper;


import com.soft1851.springboot.aop.entity.Soft;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xunmi
 * @ClassName SoftMapper
 * @Description TODO
 * @Date 2020/4/8
 * @Version 1.0
 **/
public interface SoftMapper {

    /**
     * 查询 t_soft 表中所有数据
     *
     * @return List<Soft>
     */
    @Select("SELECT * FROM t_soft ORDER BY birthday")
    List<Soft> selectAll();
}
