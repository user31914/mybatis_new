package com.hhit.test;

import com.hhit.model.Student;
import com.hhit.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestSelect {
    public static void main(String[] args) {
        SqlSession session = SessionUtil.getSession();
//        List<Student> selectList = session.selectList("selectList");
//       Student s = session.selectOne("selectById", 10);
        Student student = new Student();
        student.setGender("男").setAge(25);
        List<Student> selectList = session.selectList("selectByCondition", student);
        session.close();
//        System.out.println(s);
        selectList.forEach(System.out::println);
    }
}
