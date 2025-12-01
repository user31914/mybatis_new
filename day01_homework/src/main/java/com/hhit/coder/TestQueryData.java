package com.hhit.coder;

import com.hhit.model.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestQueryData {
    public static void main(String[] args) throws IOException {
        //加载配置文件并获取输入流
        InputStream inputStream = Resources.getResourceAsStream("mybatis_config.xml");
        //创建SqlSessionFactoryBuilder实例，便于创建MyBatis核心工厂SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //创建SqlSessionFactory
        SqlSessionFactory factory = builder.build(inputStream);
        //创建数据库会话
        SqlSession sqlSession = factory.openSession();
        // 执行 selectAll位置上的sql
        List<Teacher> list = sqlSession.selectList("selectAll");
        //关闭资源
        sqlSession.close();
        //打印数据
        list.forEach(System.out::println);
    }
}
