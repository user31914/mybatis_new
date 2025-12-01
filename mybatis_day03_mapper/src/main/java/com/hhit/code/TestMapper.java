package com.hhit.code;

import com.hhit.mapper.StudentMapper;
import com.hhit.model.Student;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestMapper {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);


        //查询全部
//        List<Student> students = mapper.selectList();
//        students.forEach(System.out::println);
         //通过Id查数据
//        Student student = mapper.selectById(10);
//        System.out.println(student);
        //保存数据
//        Student stu = new Student();
//        stu.setId(0).setName("孙悟空").setAge(500).setGender("男");
//        mapper.insert(stu);
//        session.commit();


        //删除数据
//          mapper.delete(15);
//          session.commit();

        //修改数据
        Student student = new Student();
        student.setId(6).setName("猪八戒").setAge(300).setGender("男");
        mapper.update(student);
        session.commit();
        session.close();

    }
}
