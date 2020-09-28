package com.tianyisoft.dao;

import com.tianyisoft.po.Person;
import com.tianyisoft.pojo.SelectPersonById;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PersonDao {
    public Person findById(Integer id);
    public Person findById2(Integer id);
    public SelectPersonById findById3(Integer id);
}
