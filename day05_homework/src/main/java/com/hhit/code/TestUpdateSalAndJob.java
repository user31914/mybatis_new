package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestUpdateSalAndJob {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.selectList();
        List<String> citys = teachers.stream().map(Teacher::getAddr).map(city ->{
            int index = city.indexOf("省");
            return city.substring(index+1);
        }).distinct().collect(Collectors.toList());
        System.out.println("员工所在城市为以下城市：");
        System.out.println(citys);
        System.out.println("请输入你想更新的城市:");
        Scanner sc = new Scanner(System.in);
        String city = sc.next();
        List<Teacher> teachers1 = mapper.selectByCity(city);
        System.out.println(city+"员工的信息如下：");
        teachers1.forEach(System.out::println);
        System.out.println("请输入更新后的工资：");
        int sal = sc.nextInt();
        System.out.println("请输入更新后的职务：");
        String job = sc.next();
        Teacher teacher = new Teacher();
        teacher.setAddr(city).setSal(sal).setJob(job);
        mapper.updateSalAndJob(teacher);
        System.out.println("更新成功");
        session.close();
    }
}
