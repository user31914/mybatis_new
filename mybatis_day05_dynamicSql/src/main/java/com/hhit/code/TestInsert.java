package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Stu;
import com.hhit.model.Student;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class TestInsert {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        insertStus(mapper);
        session.close();
    }
    public static void insertStus(StudentMapper mapper) {
        List<Stu> list = new ArrayList<Stu>();
        list.add(new Stu(0,"李白",23,"男"));
        list.add(new Stu(0,"杜甫",26,"男"));
        list.add(new Stu(0,"李清照",22,"女"));
        mapper.insert(list);
    }
}
