package com.example.service;

import com.example.model.User;

import java.util.List;

/**
 * @Description:
 * @Author:Sevenx:
 * @Time:2018-12-15
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser();

    User findOne();
}
