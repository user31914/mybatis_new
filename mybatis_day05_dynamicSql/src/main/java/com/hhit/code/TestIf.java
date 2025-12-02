package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestIf {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student stu = new Student();
        List<Student> students = mapper.selectByCondition(stu);
        students.forEach(System.out::println);
        session.close();
    }
}
