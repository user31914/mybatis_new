package com.hhit.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    public static SqlSession getSqlSession(boolean autoCommit){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        return factory.openSession(autoCommit);
    }
    public static SqlSession getSqlSession() {
        return getSqlSession(false);
    }

}
