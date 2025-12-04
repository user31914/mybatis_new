package com.hhit.code;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.model.TeacherExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class TestSelect {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        PageHelper.startPage(1,3);
        TeacherExample example = new TeacherExample();
        example.createCriteria().andAddrLike("江苏省%");

        List<Teacher> teachers = mapper.selectByExample(example);
        PageInfo<Teacher> pageInfo = new PageInfo<>(teachers);
        List<Teacher> list = pageInfo.getList();
        list.forEach(System.out::println);
        session.close();
    }
}
