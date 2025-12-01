package com.hhit.test;

import com.hhit.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestQuery {
    public static void main(String[] args) throws IOException {
        //获取输入流
        InputStream inputStream = Resources.getResourceAsStream("mybatis_config.xml");

        //创建工厂建造者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        //创建Session工厂
        SqlSessionFactory factory = builder.build(inputStream);

        //创建出session对象
        SqlSession session = factory.openSession();

        //session调用方法执行sql
        List<Student> selectAll = session.selectList("selectAll");

        //输出结果
        selectAll.forEach(System.out::println);
    }
}
