package com.hhit.test;

import com.hhit.model.Student;
import com.hhit.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestUpdate {
    public static void main(String[] args) {
        SqlSession session = SessionUtil.getSession(true);
        Student student = new Student();
//        student.setId(3).setName("陆游").setAge(29).setGender("男");
//        session.update("update",student);
        student.setAge(30).setGender("男");
        session.update("updateByGender",student);
        session.close();
    }
}
