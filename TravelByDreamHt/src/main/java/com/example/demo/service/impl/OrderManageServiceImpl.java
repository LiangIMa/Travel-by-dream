package com.example.demo.service.impl;

import com.example.demo.dao.OrderManageMapper;
import com.example.demo.entity.OrderManage;
import com.example.demo.service.OrderManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("OrderManageService")
public class OrderManageServiceImpl implements OrderManageService{
    @Resource
    private OrderManageMapper userDao;


    public OrderManage getOrderManageById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
