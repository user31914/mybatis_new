package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.Arrays;
import java.util.List;

public class TestDelete {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        //deleteUseArray(mapper);
        //deleteUseList(mapper);
        deleteUseList2(mapper);
        session.close();
    }
    public static void deleteUseArray(StudentMapper mapper){
        int []ids = {17,18};
        mapper.delete(ids);

    }
    public static void deleteUseList(StudentMapper mapper){
    List ids = Arrays.asList(20,21);
        mapper.deleteList(ids);
    }
    public static void deleteUseList2(StudentMapper mapper){
        Student student = new Student();
        List<Integer> ids = Arrays.asList(22,23);
        student.setIds(ids);
        mapper.deleteByObject(student);
    }
}
