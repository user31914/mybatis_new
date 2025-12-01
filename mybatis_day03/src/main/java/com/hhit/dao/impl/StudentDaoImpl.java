package com.hhit.dao.impl;

import com.hhit.dao.StudentDao;
import com.hhit.model.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.Collections;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public int save(Student student) {
        SqlSession session = getSqlSession();
        int row = session.insert("insertObject", student);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int update(Student student) {
        SqlSession session = getSqlSession();
        int row = session.update("update", student);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public int delete(int id) {
        SqlSession session = getSqlSession();
        int row = session.delete("deleteById", id);
        session.commit();
        session.close();
        return row;
    }

    @Override
    public Student selectById(int id) {
        SqlSession session = getSqlSession();
        Student student = session.selectOne("selectById", id);
        session.close();
        return student;
    }

    @Override
    public List<Student> selectAll() {
        SqlSession session = getSqlSession();
        List<Student> list = session.selectList("selectList");
        session.close();
        return list;
    }
}
