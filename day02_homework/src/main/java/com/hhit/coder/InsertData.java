package com.hhit.coder;

import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class InsertData {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession(true);
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher(0,"张三","江苏省南京市",35,"区域总监",20000));
        teachers.add(new Teacher(0,"李四","江苏省苏州市",32,"销售经理",15000));
        teachers.add(new Teacher(0,"王五","四川省成都市",26,"销售员",8000));
        teachers.add(new Teacher(0,"赵六","吉林省长春市",27,"财务",10000));
        teachers.add(new Teacher(0,"刘七","吉林省吉林市",24,"销售员",6000));
        teachers.add(new Teacher(0,"吴八","陕西省西安市",31,"销售员",7000));
        for (Teacher teacher : teachers) {
            sqlSession.insert("teacher.insert", teacher);
        }
        sqlSession.close();
    }
}
