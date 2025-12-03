package com.hhit.code;

import com.hhit.mapper.UsersMapper;
import com.hhit.model.Permision;
import com.hhit.model.Role;
import com.hhit.model.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        Users users = new Users();
        Scanner sc = new Scanner(System.in);
        System.out.println("请登录系统:");
        System.out.println("请输入用户名:");
        users.setUname(sc.next());
        System.out.println("请输入密码:");
        users.setPwd(sc.next());
        UsersMapper mapper = session.getMapper(UsersMapper.class);
        Users user = mapper.login(users);
        if (user == null) {
            System.out.println("登录失败");
        } else {
            System.out.println("【" + user.getUname() + "】登录系统");
            List<Role> roles = user.getRoles();
            for (Role role : roles) {
                System.out.println(user.getUname() + "是" + role.getRname() + ":");
                System.out.println("可操作菜单");
                List<Permision> permissions = role.getPermissions();
                for (Permision permission : permissions) {
                    System.out.println("<a href='" + permission.getUrl() + "'>" + permission.getPname() + "</a>");
                }
                System.out.println();
            }
            users.setLasttime(LocalDateTime.now());
            mapper.update(users);
            session.commit();
        }
        session.close();
    }
}

