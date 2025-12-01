package com.hhit.coder;

import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;

public class CalAvgSalary {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        BigDecimal avgSal = session.selectOne("calAvgSalary", "吉林省");
        session.close();
        System.out.println(avgSal);
    }
}
