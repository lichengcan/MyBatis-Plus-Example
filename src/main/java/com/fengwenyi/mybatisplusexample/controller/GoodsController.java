package com.fengwenyi.mybatisplusexample.controller;

import com.fengwenyi.mybatisplusexample.entity.GoodsEntity;
import com.fengwenyi.mybatisplusexample.mapper.IGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lichengcan
 * @date: 2023-07-04 17:04
 * @description
 **/
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    IGoodsMapper iGoodsMapper;

    @PostMapping("/test")
    public void test(@RequestBody GoodsEntity goodsEntity){
        iGoodsMapper.insert(goodsEntity);
    }
}
