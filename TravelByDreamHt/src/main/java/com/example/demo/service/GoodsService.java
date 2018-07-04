package com.example.demo.service;

import com.example.demo.entity.Goods;

public interface GoodsService {
    public Goods getUserById(String userId);
    // 添加商品
    public int insertGoods(Goods good);
}
