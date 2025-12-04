package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import com.hhit.model.StudentExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class TestUpdate {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        Student student = mapper.selectByPrimaryKey(16);
//        student.setGender("女").setName("小龙女").setAge(27);
//        mapper.updateByPrimaryKey(student);
        Student student = new Student();
        student.setAge(25);
        StudentExample example = new StudentExample();
        example.createCriteria().andGenderEqualTo("男");
        mapper.updateByExampleSelective(student,example);
        session.commit();
        session.close();
    }
}
