package com.example.demo.service;


import com.example.demo.entity.ShopCar;

import java.util.List;

public interface ShopCarService {

    public ShopCar getShopCarById(String goodId);

    public int insertGoods(ShopCar good);

    public int updataGoods(ShopCar good);

    public List<ShopCar> queryCarGoodsByUser(int userId);
}
