package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestAnnotation {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        //查全部数据
        List<Student> students = mapper.selectList();
        students.forEach(System.out::println);

        //根据id查
//        Student student = mapper.selectById(10);
//        System.out.println(student);

        //插入数据
//        mapper.save(new Student(1,"张无忌",23,"男"));
//        session.commit();

        //修改数据
//        mapper.update(new Student(6,"张起灵",100,"男"));
//        session.commit();

        //删除数据
//        mapper.delete(6);
//        session.commit();
        session.close();
    }
}
