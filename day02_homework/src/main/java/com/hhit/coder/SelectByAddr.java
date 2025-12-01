package com.hhit.coder;

import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SelectByAddr {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        List<Teacher> list = session.selectList("selectByAddr", "江苏省");
        session.close();
        list.forEach(System.out::println);
    }
}
