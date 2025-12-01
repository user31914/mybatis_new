package com.hhit.dao;

import com.hhit.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface StudentDao {
    default SqlSession getSqlSession() {
        InputStream inputStream = null;
        try {
             inputStream = Resources.getResourceAsStream("mybatis_config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
       return factory.openSession();
    }
    int save(Student student);
    int update(Student student);
    int delete(int id);
    Student selectById(int id);
    List<Student> selectAll();
}
