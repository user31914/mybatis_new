package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.time.temporal.TemporalAccessor;

public class TestInsert {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        Teacher teacher = new Teacher();
        teacher.setId(1).setName("黄二狗").setAddr("江西省南昌市").setAge(22).setJob("程序员").setSal(10000);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        mapper.insert(teacher);
        session.close();

    }
}
