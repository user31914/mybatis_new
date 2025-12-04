package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.model.TeacherExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class TestUpdateSal {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        TeacherExample example = new TeacherExample();
        example.createCriteria().andAgeGreaterThan(27);
        List<Teacher> teachers = mapper.selectByExample(example);
     teachers.stream().forEach(teacher -> teacher.setSal(teacher.getSal()+1000));
        for (Teacher teacher : teachers) {
           mapper.updateByPrimaryKey(teacher);
           session.commit();
        }
        session.close();
    }
}
