package com.hhit.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    public static SqlSession getSqlSession() {
        InputStream inputStream = null;
        try {
             inputStream = Resources.getResourceAsStream("mybatis_config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
      return   builder.build(inputStream).openSession();
    }
    public static SqlSession getSqlSession(boolean autoCommit) {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis_config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        return   builder.build(inputStream).openSession(autoCommit);
    }
}
