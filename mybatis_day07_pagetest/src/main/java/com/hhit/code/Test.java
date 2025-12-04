package com.hhit.code;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        PageHelper.startPage(2,3);
        List<Student> students = mapper.selectList();
        PageInfo<Student> page = new PageInfo<>(students);
        List<Student> list = page.getList();
        list.forEach(System.out::println);
        session.close();

    }
}
