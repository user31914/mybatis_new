package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.StudentExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class TestDelete {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        mapper.deleteByPrimaryKey(19);
//        session.commit();
//        session.close();
        StudentExample example = new StudentExample();
        example.createCriteria().andAgeBetween(25,30).andGenderEqualTo("男");
        mapper.deleteByExample(example);
        session.commit();
        session.close();
    }
}
