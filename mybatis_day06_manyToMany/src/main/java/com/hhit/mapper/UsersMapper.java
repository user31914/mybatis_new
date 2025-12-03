package com.hhit.mapper;

import com.hhit.model.Users;

import java.util.List;

public interface UsersMapper {
    List<Users> selectList();
    Users login(Users user);
    void delete(int rid);
}
