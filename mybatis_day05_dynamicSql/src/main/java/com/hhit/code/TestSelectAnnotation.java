package com.hhit.code;

import com.hhit.mapper.StuMapper;
import com.hhit.mapper.StudentMapper;
import com.hhit.model.Stu;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestSelectAnnotation {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        StuMapper mapper = session.getMapper(StuMapper.class);
        mapper.selectList(new Stu().setName("陈%"));
        session.close();
    }
}
