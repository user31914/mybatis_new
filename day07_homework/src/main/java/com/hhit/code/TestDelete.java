package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.TeacherExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class TestDelete {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        TeacherExample example = new TeacherExample();
        example.createCriteria().andAddrLike("陕西省%");
        mapper.deleteByExample(example);
        session.commit();
        session.close();
    }
}
