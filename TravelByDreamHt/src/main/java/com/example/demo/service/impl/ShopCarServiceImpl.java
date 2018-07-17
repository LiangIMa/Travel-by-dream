package com.example.demo.service.impl;

import com.example.demo.dao.ShopCarMapper;
import com.example.demo.entity.ShopCar;
import com.example.demo.service.ShopCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("ShopCarService")
public class ShopCarServiceImpl implements ShopCarService{

    @Resource
    private ShopCarMapper ShopCarDao;

    public ShopCar getShopCarById(String goodId) {
        return ShopCarDao.getShopCarById(goodId);
    }
}
