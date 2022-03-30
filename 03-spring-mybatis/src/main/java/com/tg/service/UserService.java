package com.tg.service;

import com.tg.domain.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    List<User> queryAll();
}
