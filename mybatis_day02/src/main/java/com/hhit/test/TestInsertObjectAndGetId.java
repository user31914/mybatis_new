package com.hhit.test;

import com.hhit.model.Student;
import com.hhit.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestInsertObjectAndGetId {
    public static void main(String[] args) {
        SqlSession session = SessionUtil.getSession(true);
        Student student = new Student();
        student.setName("杜甫").setAge(22).setGender("男");
        int insert = session.insert("student.insertObjectAndGetId",student);
        System.out.println(insert>0?"插入成功":"插入失败");
        //获取最新插入的数据的id
        System.out.println(student.getId());
    }
}
