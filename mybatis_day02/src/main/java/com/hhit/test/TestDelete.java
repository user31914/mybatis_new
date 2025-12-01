package com.hhit.test;

import com.hhit.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestDelete {
    public static void main(String[] args) {
        SqlSession session = SessionUtil.getSession(true);
//        int deleteById = session.delete("deleteById", 7);
//        session.close();
        int delete = session.delete("deleteByName", "李");
        session.close();
        System.out.println(delete>0?"success":"fail");
    }
}
