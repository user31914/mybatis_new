package com.hhit.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class SqlSessionUtil {
    public static SqlSession getSqlSession() {
        try {
            return new SqlSessionFactoryBuilder().
                    build(Resources.getResourceAsReader("mybatis_config.xml")).
                    openSession();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static SqlSession getSqlSession(boolean autoCommit) {
        try {
            return new SqlSessionFactoryBuilder().
                    build(Resources.getResourceAsReader("mybatis_config.xml")).
                    openSession(autoCommit);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
