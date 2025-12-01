package com.hhit.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestInsert {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        int insert = session.insert("student.insert");
        session.commit();
        session.close();
        in.close();
        System.out.println(insert>0?"插入成功":"插入失败");
    }
}
