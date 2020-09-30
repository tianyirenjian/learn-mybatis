package com.tianyisoft.dao;

import com.tianyisoft.po.User;
import com.tianyisoft.pojo.SelectUserWithOrders;
import com.tianyisoft.pojo.UserGroup;
import com.tianyisoft.pojo.UserWithOrders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface UserDao {
    User find(Integer id);
    List<User> get();
    int create(User user);
    int createWithoutId(User user);
    int update(User user);
    int delete(Integer id);

    List<User> byName(String name);
    List<Map<String, Object>> mapTest();
    List<UserGroup> pojoTest();
    User findWithOrders(Integer id);
    User findWithOrders2(Integer id);
    SelectUserWithOrders findWithOrders3(Integer id);
    List<UserWithOrders> findWithOrders4(Integer id);
}
