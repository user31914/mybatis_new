package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestSelect {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        //通过id查
        //selectById(mapper);

        //查全部teacher数据
        selectList(mapper);
        session.close();
    }
    public static void selectById(TeacherMapper mapper){
        Teacher teacher = mapper.selectById(13);
        System.out.println(teacher);
    }
    public static void selectList(TeacherMapper mapper){
        List<Teacher> teachers = mapper.selectList();
        teachers.forEach(System.out::println);

    }
}
