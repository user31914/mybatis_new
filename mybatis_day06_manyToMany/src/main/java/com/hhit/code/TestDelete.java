package com.hhit.code;

import com.hhit.mapper.UsersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class TestDelete {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        mapper.delete(3);
        session.commit();
        session.close();
    }
}
