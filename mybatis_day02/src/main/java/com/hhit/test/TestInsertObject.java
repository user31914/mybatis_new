package com.hhit.test;

import com.hhit.model.Student;
import com.hhit.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestInsertObject {
    public static void main(String[] args) {
        //开启自动提交事务
        SqlSession session = SessionUtil.getSession(true);
        Student student = new Student();
        student.setName("贺知章").setAge(36).setGender("男");
        int insert = session.insert("student.insertObject", student);
        System.out.println(insert>0?"插入成功":"插入失败");
        session.commit();
    }
}
