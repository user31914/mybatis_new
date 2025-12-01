package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestDelete {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        mapper.deleteById(12);
        session.close();
    }
}
