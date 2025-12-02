package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestChoose {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student stu = new Student();
        List<Student> students = mapper.selectByConditionChoose(stu);
        students.forEach(System.out::println);
        session.close();
    }
}
