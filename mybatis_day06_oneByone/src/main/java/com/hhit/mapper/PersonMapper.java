package com.hhit.mapper;

import com.hhit.model.Person;
import com.hhit.model.PersonQuery;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonMapper {
    @Insert("insert into person values (default,#{pname},#{page})")
    void insert(Person person);

    @Select("select * from person p join driver d on p.pid = d.pid")
    List<PersonQuery> selectList();
}
