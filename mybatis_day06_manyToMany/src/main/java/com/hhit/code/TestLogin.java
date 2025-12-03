package com.hhit.code;

import com.hhit.mapper.UsersMapper;
import com.hhit.model.Roles;
import com.hhit.model.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Users user = new Users();
        System.out.println("请登录系统:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        user.setUname(scanner.next());
        System.out.println("请输入密码:");
        user.setPassword(scanner.next());
        Users login = mapper.login(user);
        if(login == null){
            System.out.println("登录失败");
        }else{
            System.out.println("欢迎用户：【"+login.getUname()+"】");
            System.out.println("您的角色有：");
            List<Roles> roles = login.getRoles();
            for(Roles role : roles){
                System.out.println(role.getRname());
            }
        }
        session.close();
    }
}
