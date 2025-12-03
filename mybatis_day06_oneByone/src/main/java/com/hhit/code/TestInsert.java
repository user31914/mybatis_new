package com.hhit.code;

import com.hhit.mapper.DriverMapper;
import com.hhit.mapper.PersonMapper;
import com.hhit.model.Driver;
import com.hhit.model.Person;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class TestInsert {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
//        PersonMapper mapper = session.getMapper(PersonMapper.class);
//        mapper.insert(new Person(0,"李白",23));
//        mapper.insert(new Person(0,"白居易",24));
//        mapper.insert(new Person(0,"李商隐",26));

        DriverMapper mapper = session.getMapper(DriverMapper.class);
        mapper.insert(new Driver(0,"A",1));
        mapper.insert(new Driver(0,"B",2));
        mapper.insert(new Driver(0,"C",3));
        session.commit();
        session.close();

    }
}
