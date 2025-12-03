package com.hhit.code;

import com.hhit.mapper.DriverInfoMapper;
import com.hhit.model.Driver;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestSelectWay2 {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        DriverInfoMapper mapper = session.getMapper(DriverInfoMapper.class);
        List<Driver> drivers = mapper.selectList();
        drivers.forEach(System.out::println);
        session.close();
    }
}
