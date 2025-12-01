package com.hhit.mapper;

import com.hhit.model.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TeacherMapper {
    @Insert("insert into teacher values (null,#{name},#{addr},#{age},#{job},#{sal})")
    void insert(Teacher teacher);

    @Delete("delete from teacher where id = #{id}")
    void deleteById(int id);

    @Update("update teacher set name = #{name},addr = #{addr},age = #{age},job = #{job},sal = #{sal} where id = #{id}")
    void update(Teacher teacher);

    @Select("select * from teacher where id = #{id}")
    Teacher selectById(int id);
    @Select("select * from teacher")
    List<Teacher> selectList();

}
