package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import com.hhit.model.StudentExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class TestSelect {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        StudentExample example = new StudentExample();
        example.createCriteria().andAgeBetween(25,30);
//        Student student = mapper.selectByPrimaryKey(10);
//        System.out.println(student);
        List<Student> students = mapper.selectByExample(example);
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();

    }
}
