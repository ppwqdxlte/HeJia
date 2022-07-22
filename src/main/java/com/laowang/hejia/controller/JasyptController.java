package com.laowang.hejia.controller;

import com.laowang.hejia.config.JasyptProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/jasypt")
public class JasyptController {

    @Resource
    private JasyptProperties configProperties;

    @RequestMapping("/db")
    public void print(){
        //这就是自欺欺人，jasypt自动解密了，还原成原文打印在控制台，根本加密不了啊，玩具一样的jasypt
        System.out.println(configProperties.getUrl());
        System.out.println(configProperties.getUsername());
        System.out.println(configProperties.getPassword());
    }

}
