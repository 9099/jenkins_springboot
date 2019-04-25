package com.example.service.Impl;

import com.example.mappers.NewsMapper;
import com.example.model.News;
import com.example.service.NewsService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import com.github.pagehelper.PageHelper;

/**
 * @Description:
 * @Author:Sevenx:
 * @Time:2018-12-15
 */
@Service(value = "newsService")
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;//这里会报错，但是并不会影响



    @Override
    public List<News> findAll() {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        //PageHelper.startPage(1, 10);

        //PageInfo<News> pageInfo = new PageInfo<>(newsMapper.findAll());

        return newsMapper.findAll();

    }

    @Override
    public News findOne() {

        return new News(1,"11111", (byte) 2,"http://cms-bucket.nosdn.127.net/2018/11/26/fdbb4283231a41f586f470688ea480bf.png");
        //return userMapper.selectByPrimaryKey(new Random().nextInt(100));
    }


}
