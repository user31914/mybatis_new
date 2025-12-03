package com.hhit.mapper;

import com.hhit.model.Users;

import java.time.LocalDateTime;

public interface UsersMapper {
    Users login(Users users);
    void update(Users users);
}
