package com.hhit.code;

import com.hhit.mapper.UsersMapper;
import com.hhit.model.Roles;
import com.hhit.model.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class TestSelectList {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        List<Users> users = mapper.selectList();
        for (Users user : users) {
            System.out.println("用户："+user.getUname());
            System.out.println("用户密码："+user.getPassword());
            List<Roles> list = user.getRoles();
            System.out.println(user.getUname()+"的角色有：");
            for (Roles role : list) {
                System.out.println(role.getRname());
            }
        }
        session.close();
    }
}
