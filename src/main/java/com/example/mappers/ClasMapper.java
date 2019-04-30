package com.example.mappers;

import com.example.model.Clas;

public interface ClasMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Clas record);

    int insertSelective(Clas record);

    Clas selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Clas record);

    int updateByPrimaryKey(Clas record);


}