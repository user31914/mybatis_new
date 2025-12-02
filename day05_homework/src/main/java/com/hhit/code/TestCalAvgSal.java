package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestCalAvgSal {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.selectList();
        List<String> citys = teachers.stream().map(Teacher::getAddr).map(city ->{
            int index = city.indexOf("省");
            return city.substring(0,index+1);
        }).distinct().collect(Collectors.toList());
        System.out.println("员工所在省份为以下省份：");
        System.out.println(citys);
        System.out.println("请输入你想查询的省份:");
        Scanner sc = new Scanner(System.in);
        String city = sc.next();
        BigDecimal bigDecimal = mapper.calAvgSal(city);
        System.out.println(city+"员工平均工资为"+bigDecimal+"元");
        session.close();
    }
}
