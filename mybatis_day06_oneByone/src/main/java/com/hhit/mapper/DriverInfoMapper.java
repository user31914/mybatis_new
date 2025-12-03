package com.hhit.mapper;

import com.hhit.model.Driver;
import com.hhit.model.DriverQuery;

import java.util.List;

public interface DriverInfoMapper {
    List<Driver> selectList();
}
