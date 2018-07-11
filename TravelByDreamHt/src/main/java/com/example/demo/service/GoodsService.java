package com.example.demo.service;

import com.example.demo.entity.Goods;

import java.util.List;

public interface GoodsService {
    public Goods getUserById(String userId);
    // 添加商品
    public int insertGoods(Goods good);
    //查询商品
    public List<Goods> selectGoods();
}
