package com.example.mappers;

import com.example.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer goodsid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}