package com.hhit.code;

import com.hhit.mapper.PersonMapper;
import com.hhit.model.PersonQuery;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestSelectListWay1 {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        List<PersonQuery> personQueries = mapper.selectList();
        personQueries.forEach(System.out::println);
        session.close();
    }
}
