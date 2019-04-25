package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description:
 * @Author:Sevenx:
 * @Time:2018-12-15
 */
@Controller

public class HttpController {

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody

    @RequestMapping(value = "/req")
    public String httpController(@RequestParam("u") String url) {
        System.out.println("======================================="+url);
        String uri="http://c.m.163.com/nc/article/headline/T1348647853363/0-40.html";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("http://").append(url);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        String strbody=restTemplate.exchange(stringBuffer.toString(), HttpMethod.GET, entity,String.class).getBody();

        return strbody;

    }




}
