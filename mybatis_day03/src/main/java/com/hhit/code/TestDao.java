package com.hhit.code;

import com.hhit.dao.StudentDao;
import com.hhit.dao.impl.StudentDaoImpl;
import com.hhit.model.Student;

import java.util.List;

public class TestDao {
    public static void main(String[] args) {
        StudentDao dao = new StudentDaoImpl();
        //查询全部
        //selectList(dao);
        //通过id查
        //selectById(dao);
        //保存
        //save(dao);
        //更新
        //update(dao);
        //删除
        delete(dao);
    }
    public static void selectList(StudentDao dao){
        List<Student> students = dao.selectAll();
        students.forEach(System.out::println);
    }
    public static void selectById(StudentDao dao){
        Student stu = dao.selectById(3);
        System.out.println(stu);
    }
    public static void save(StudentDao dao){
        Student stu = new Student();
        stu.setId(0).setName("小明").setAge(18).setGender("女");
        int save = dao.save(stu);
        System.out.println(save>0?"success":"fail");
    }
    public static void update(StudentDao dao){
        Student stu = new Student();
        stu.setId(10).setGender("女").setAge(22).setName("小陈");
        int update = dao.update(stu);
        System.out.println(update>0?"success":"fail");
    }
    public static void delete(StudentDao dao){
        int delete = dao.delete(3);
        System.out.println(delete>0?"success":"fail");
    }
}
