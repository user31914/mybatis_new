package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Stu;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestSelectByName {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Stu stu = new Stu();
        stu.setName("陈");
        mapper.selectByName(stu);
        session.close();
    }
}
