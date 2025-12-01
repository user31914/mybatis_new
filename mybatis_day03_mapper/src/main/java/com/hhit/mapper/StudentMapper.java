package com.hhit.mapper;

import com.hhit.model.Student;

import java.util.List;

public interface StudentMapper {
    void insert(Student student);
    void update(Student student);
    void delete(int id);
    Student selectById(int id);
    List<Student> selectList();
}
