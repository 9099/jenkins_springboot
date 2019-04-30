package com.example.service.Impl;

import com.example.mappers.ClasMapper;
import com.example.model.Clas;
import com.example.model.News;
import com.example.service.ClasService;
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
public class ClasServiceImpl implements ClasService {

    @Autowired
    private ClasMapper clasMapper;//这里会报错，但是并不会影响


    @Override
    public Clas selectByPrimaryKey(int id) {
        return clasMapper.selectByPrimaryKey(id);
    }
}
