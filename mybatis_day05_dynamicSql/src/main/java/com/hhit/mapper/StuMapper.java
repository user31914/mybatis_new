package com.hhit.mapper;

import com.hhit.model.Stu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StuMapper {
    @Select("<script>" +
            "select * from student" +
            "<where>" +
            "<if test = \" name != null and name !='' \">" +
            "and name like #{name}" +
            "</if>" +
            "</where>" +
            "</script>")
    List<Stu>selectList(Stu stu);
}
