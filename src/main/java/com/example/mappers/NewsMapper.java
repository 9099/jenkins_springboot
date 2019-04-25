package com.example.mappers;

import com.example.model.News;
import com.example.model.User;

import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    List<News> findAll();
}