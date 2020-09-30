package com.tianyisoft.dao;

import com.tianyisoft.po.Person;
import com.tianyisoft.pojo.SelectPersonById;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PersonDao {
    Person findById(Integer id);
    Person findById2(Integer id);
    SelectPersonById findById3(Integer id);
}
