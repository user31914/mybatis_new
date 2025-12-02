package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestDeleteByIds {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.selectList();
        List<Integer> list = teachers.stream().map(Teacher::getId).collect(Collectors.toList());
        System.out.println("所有员工id如下：");
        System.out.println(list);
        Scanner scanner = new Scanner(System.in);
        List<Integer> ids = new ArrayList<>();
        while (true) {
            System.out.println("请输入要删除的id,输入0表示结束");
            int id = scanner.nextInt();
            if (id == 0) {
                break;
            } else {
                ids.add(id);
            }
        }
        System.out.println(ids);
        mapper.deleteByIds(ids);
        System.out.println("删除成功");
        session.commit();
        session.close();
    }
}
