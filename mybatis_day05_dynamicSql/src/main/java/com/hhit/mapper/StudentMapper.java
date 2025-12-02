package com.hhit.mapper;

import com.hhit.model.Stu;
import com.hhit.model.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectByCondition(Student student);
    List<Student> selectByConditionChoose(Student student);
    List<Student>selectByConditionWhere(Student student);
    List<Student> selectByConditionTrim(Student student);
    void update(Student student);
    void delete(int []ids);
    void deleteList(List<Integer> ids);
    void deleteByObject(Student student);
    void insert(List<Stu> list);
    List<Stu> selectByName(Stu student);
}
