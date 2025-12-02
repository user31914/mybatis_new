package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestWhereAndTrim {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        testWhere(mapper);
        //testTrim(mapper);
        session.close();
    }
    public static void testWhere(StudentMapper mapper){
        Student stu = new Student();
        //stu.setName("小陈");
        stu.setAge(22);
        List<Student> students = mapper.selectByConditionWhere(stu);
        students.forEach(System.out::println);
    }
    public static void testTrim(StudentMapper mapper){
        Student stu = new Student();
        //stu.setName("小陈");
        stu.setAge(22);
        List<Student> students = mapper.selectByConditionTrim(stu);
        students.forEach(System.out::println);
    }
}
