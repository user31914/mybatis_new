package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class TestInsert {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.insertSelective(new Student().setName("白居易").setAge(29).setGender("男"));
        session.commit();
        session.close();
    }
}
