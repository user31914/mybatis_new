package com.hhit.util;

import com.mysql.cj.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionUtil {
    public static SqlSession getSession() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis_config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(inputStream);
            SqlSession sqlSession = factory.openSession();
            return  sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static SqlSession getSession(boolean autoCommit) {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis_config.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(inputStream);
            SqlSession sqlSession = factory.openSession(autoCommit);
            return  sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
