package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestUpdateJob {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = new Teacher();
        teacher.setJob("销售员").setAge(30);
        mapper.updateJob(teacher);
        session.close();
    }
}
