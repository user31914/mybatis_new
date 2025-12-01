package com.hhit.mapper;

import com.hhit.model.Teacher;

import java.math.BigDecimal;
import java.util.List;

public interface TeacherMapper {
    void insert(Teacher teacher);

    List<Teacher> selectByAddr(String addr);

    BigDecimal calAvgSal(String addr);

    void updateJob(Teacher teacher);

    void deleteByAge(int age);
}
