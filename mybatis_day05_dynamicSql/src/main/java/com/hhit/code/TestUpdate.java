package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestUpdate {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student stu = new Student();
        stu.setId(10).setName("陈伊人").setAge(23);
        mapper.update(stu);
        session.close();
    }
}
