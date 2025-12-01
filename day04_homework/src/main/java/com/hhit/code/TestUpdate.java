package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestUpdate {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = new Teacher();
        teacher.setId(13).setName("李白").setAge(30).setAddr("广东省广州市").setJob("作家").setSal(15000);
        mapper.update(teacher);
        session.close();
    }
}
