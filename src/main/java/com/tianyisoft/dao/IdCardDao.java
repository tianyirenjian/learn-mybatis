package com.tianyisoft.dao;

import com.tianyisoft.po.IdCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IdCardDao {
    IdCard findById(Integer id);
}
