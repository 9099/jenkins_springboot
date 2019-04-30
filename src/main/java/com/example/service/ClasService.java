package com.example.service;


import com.example.model.Clas;
import com.example.model.News;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Description:
 * @Author:Sevenx:
 * @Time:2018-12-15
 */
public interface ClasService {

    Clas selectByPrimaryKey(int id);
}
