package com.tianyisoft.service.impl;

import com.tianyisoft.dao.UserDao;
import com.tianyisoft.po.User;
import com.tianyisoft.pojo.SelectUserWithOrders;
import com.tianyisoft.pojo.UserGroup;
import com.tianyisoft.pojo.UserWithOrders;
import com.tianyisoft.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public User find(Integer id) {
        return userDao.find(id);
    }

    public List<User> get() {
        return userDao.get();
    }

    public int create(User user) {
        return userDao.create(user);
    }

    public int createWithoutId(User user) {
        return userDao.createWithoutId(user);
    }

    public int update(User user) {
        return userDao.update(user);
    }

    public int delete(Integer id) {
        return userDao.delete(id);
    }

    public List<User> byName(String name) {
        return userDao.byName(name);
    }

    public List<Map<String, Object>> mapTest() {
        return userDao.mapTest();
    }

    @Override
    public List<UserGroup> pojoTest() {
        return userDao.pojoTest();
    }

    @Override
    public User findWithOrders(Integer id) {
        return userDao.findWithOrders(id);
    }

    @Override
    public User findWithOrders2(Integer id) {
        return userDao.findWithOrders2(id);
    }

    @Override
    public SelectUserWithOrders findWithOrders3(Integer id) {
        return userDao.findWithOrders3(id);
    }

    @Override
    public List<UserWithOrders> findWithOrders4(Integer id) {
        return userDao.findWithOrders4(id);
    }
}
