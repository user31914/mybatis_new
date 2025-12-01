package com.hhit.code;

import com.hhit.mapper.TeacherMapper;
import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class TestInsert {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        List<Teacher> list = new ArrayList<Teacher>();
        list.add(new Teacher(1, "张三", "江苏省南京市", 35, "区域总监", 20000));
        list.add(new Teacher(2, "李四", "江苏省苏州市", 32, "销售经理", 15000));
        list.add(new Teacher(3, "王五", "四川省成都市", 26, "销售员", 8000));
        list.add(new Teacher(4, "赵六", "吉林省长春市", 27, "财务", 10000));
        list.add(new Teacher(5, "刘七", "吉林省吉林市", 24, "销售员", 6000));
        list.add(new Teacher(6, "吴八", "陕西省西安市", 21, "销售员", 7000));
        for (Teacher teacher : list) {
            mapper.insert(teacher);
        }
        session.close();
    }
}
