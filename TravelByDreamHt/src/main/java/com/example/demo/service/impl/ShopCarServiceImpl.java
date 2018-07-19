package com.example.demo.service.impl;

import com.example.demo.dao.ShopCarMapper;
import com.example.demo.entity.ShopCar;
import com.example.demo.service.ShopCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ShopCarService")
public class ShopCarServiceImpl implements ShopCarService{

    @Resource
    private ShopCarMapper ShopCarDao;

    public ShopCar getShopCarById(String goodId) {
        return ShopCarDao.getShopCarById(goodId);
    }

    public int insertGoods(ShopCar good) {
        return ShopCarDao.insertGoods(good);
    }

    public int updataGoods(ShopCar good) {
        return ShopCarDao.updataGoods(good);
    }

    public List<ShopCar> queryCarGoodsByUser(int userId) {
        List<ShopCar> goodsList = ShopCarDao.queryCarGoodsByUser(userId);
        return goodsList;
    }

    public int updataGoodsInfo(ShopCar good) {
        return ShopCarDao.updataGoodsInfo(good);
    }

    public int handleOnShelf(String goodId) {
        return ShopCarDao.handleOnShelf(goodId);
    }

    public int handleOffShelf(String goodId) {
        return ShopCarDao.handleOffShelf(goodId);
    }
}
