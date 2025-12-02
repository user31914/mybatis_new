package com.hhit.mapper;

import com.hhit.model.Teacher;

import java.math.BigDecimal;
import java.util.List;

public interface TeacherMapper {
    void insertTeacher(List<Teacher> teachers);
    List<Teacher> selectList();
    List<Teacher> selectByCity(String province);
    BigDecimal calAvgSal(String city);
    void updateSalAndJob(Teacher teacher);
    void deleteByIds(List<Integer> ids);
}
