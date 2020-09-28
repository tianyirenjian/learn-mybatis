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
    public User find(Integer id);
    public List<User> get();
    public int create(User user);
    public int createWithoutId(User user);
    public int update(User user);
    public int delete(Integer id);

    public List<User> byName(String name);
    public List<Map<String, Object>> mapTest();
    public List<UserGroup> pojoTest();
    public User findWithOrders(Integer id);
    public User findWithOrders2(Integer id);
    public SelectUserWithOrders findWithOrders3(Integer id);
    public List<UserWithOrders> findWithOrders4(Integer id);
}
