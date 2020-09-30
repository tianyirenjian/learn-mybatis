package com.tianyisoft.dao;

import com.tianyisoft.po.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderDao {
    Order findByUserId(Integer id);
    List<Order> orderWithProducts();
}
