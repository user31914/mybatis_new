package com.hhit.mapper;

import com.hhit.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentMapper {
    @Select("select * from student")
    @Results(id = "r",value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),
            @Result(column = "gender",property = "gender"),
//            @Result(property = "teams",column = "tid",
//                    one = @One(select = "com.hhit.mapper.TeamMapper.selectByTid"))
    })
    List<Student>selectList();


    @Select("select * from student")
    @ResultMap(value = {"r"})
    List<Student> selectAll();
}
