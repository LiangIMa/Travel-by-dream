package com.example.demo.service.impl;

import com.example.demo.dao.GoodsMapper;
import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import com.example.demo.utils.PageUtils;
import com.github.pagehelper.PageHelper;
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
        List<Goods> goodsList = goodsDao.selectGoods();
        return goodsList;
    }

    public List<Goods> getGoodByUserId(Integer userId) {
        return goodsDao.getGoodByUserId(userId);
    }

    public int deleteGoods(String goodId) {
        return goodsDao.deleteGoods(goodId);
    }

    public int updataGoods(Goods good) {
        return goodsDao.updataGoods(good);
    }

    public int handleOnShelf(String goodId) {
        return goodsDao.handleOnShelf(goodId);
    }

    public int handleOffShelf(String goodId) {
        return goodsDao.handleOffShelf(goodId);
    }

    public List<Goods> selectGoodsByPosition(String position) {
        return goodsDao.selectGoodsByPosition(position);
    }
}
