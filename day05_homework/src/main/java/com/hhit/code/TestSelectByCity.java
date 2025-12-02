package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestSelectByCity {
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
        System.out.println("请输入你想查询的城市:");
        Scanner sc = new Scanner(System.in);
        String city = sc.next();
        List<Teacher> teachers1 = mapper.selectByCity(city);
        System.out.println(city+"员工的员工信息如下:");
        teachers1.forEach(System.out::println);
        session.close();
    }
}
