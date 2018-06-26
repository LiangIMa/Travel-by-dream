package com.example.demo.service.impl;

import com.example.demo.dao.GoodsMapper;
import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsDao;
    public Goods getUserById(int userId) {
        return goodsDao.selectByPrimaryKey(userId);
    }
}
