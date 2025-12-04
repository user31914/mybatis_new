package com.hhit.mapper;

import com.hhit.model.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from student")
    List<Student> selectList();
}
