package com.qh.springboot_tyemleaf.mapper;

import com.qh.springboot_tyemleaf.entity.Stu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StuMapper extends tk.mybatis.mapper.common.Mapper<Stu> {
    @Select("select * from student where stu_id = #{stuId}")
    Stu findById(Integer stuId);
    @Delete("delete from student where stu_id =#{stuId}")
    Integer deleteById(@Param("stuId") Integer stuId);
}
