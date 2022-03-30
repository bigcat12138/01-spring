package com.tg.service.impl;

import com.tg.dao.UserDao;
import com.tg.domain.User;
import com.tg.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int addUser(User user) {
        return userDao.insertOne(user);
    }

    @Override
    public List<User> queryAll() {
        return userDao.selectAll();
    }
}
