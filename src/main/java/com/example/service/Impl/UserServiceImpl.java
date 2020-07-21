package com.example.service.Impl;

import com.example.mappers.UserMapper;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

//import com.github.pagehelper.PageHelper;

/**
 * @Description:
 * @Author:Sevenx:
 * @Time:2018-12-15
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public List<User> findAllUser() {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        //PageHelper.startPage(pageNum, pageSize);
        //return userMapper.selectAllUser();
        return userMapper.findAll();
    }

    @Override
    public User findOne() {

        return userMapper.selectByPrimaryKey(new Random().nextInt(100));
    }
}