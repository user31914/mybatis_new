package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;

public class TestCalAvgSal {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        BigDecimal sal = mapper.calAvgSal("吉林省");
        System.out.println("地址为吉林省的员工平均工资是："+sal);
        session.close();
    }

}
