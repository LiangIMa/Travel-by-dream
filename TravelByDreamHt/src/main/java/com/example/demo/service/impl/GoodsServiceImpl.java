package com.example.demo.service.impl;

import com.example.demo.dao.GoodsMapper;
import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsDao;

    public Goods getUserById(String userId) {
        return goodsDao.selectByPrimaryKey(userId);
    }
    // 添加商品
    public int insertGoods(Goods good) {
        return goodsDao.insertGoods(good);
    }

    public List<Goods> selectGoods() {
        return goodsDao.selectGoods();
    }
}
