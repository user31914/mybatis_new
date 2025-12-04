package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestInsertData {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher(0,"张丽","江苏省南京市",32,"销售员",7000));
        list.add(new Teacher(0,"张伟","江苏省苏州",26,"职员",5000));
        list.add(new Teacher(0,"王晓","上海市",32,"区域总监",20000));
        list.add(new Teacher(0,"赵敏","上海市",32,"财务",10000));
        for (Teacher teacher : list) {
            mapper.insert(teacher);
            session.commit();
        }
        session.close();
    }
}
