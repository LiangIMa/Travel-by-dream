package com.example.demo.service;


import com.example.demo.entity.ShopCar;

import java.util.List;

public interface ShopCarService {

    public ShopCar getShopCarById(String goodId,int userId);

    public int insertGoods(ShopCar good);

    public int updataGoods(ShopCar good);

    public List<ShopCar> queryCarGoodsByUser(int userId);

    public int updataGoodsInfo(ShopCar good);

    public int handleOnShelf(String goodId);

    public int handleOffShelf(String goodId);
}
