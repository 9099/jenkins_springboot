package com.example.service;

import com.example.model.News;
import com.example.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Description:
 * @Author:Sevenx:
 * @Time:2018-12-15
 */
public interface NewsService {

    //int addUser(User user);

    List<News> findAll();

    News findOne();
}
