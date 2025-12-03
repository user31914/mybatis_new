package com.hhit.mapper;

import com.hhit.model.Driver;
import org.apache.ibatis.annotations.Insert;

public interface DriverMapper {
    @Insert("insert into driver values (default,#{dtype},#{pid})")
    void insert (Driver driver);
}
