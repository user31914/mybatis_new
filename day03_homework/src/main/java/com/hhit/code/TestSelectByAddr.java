package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestSelectByAddr {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> list = mapper.selectByAddr("江苏省");
        list.forEach(System.out::println);
        session.close();
    }
}
