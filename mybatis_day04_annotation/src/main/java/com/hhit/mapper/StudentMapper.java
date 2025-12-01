package com.hhit.mapper;

import com.hhit.model.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {
    @Insert("insert into student values (default,#{name},#{age},#{gender})")
    void save(Student student);
    @Update("update student set name = #{name},age = #{age},gender = #{gender} where id =#{id}")
    void update(Student student);
    @Delete("delete from student where id =#{id}")
    void delete(int id);
    @Select("select * from student where id = #{id}")
    Student selectById(int id);
    @Select("select * from student")
    List<Student> selectList();
}
