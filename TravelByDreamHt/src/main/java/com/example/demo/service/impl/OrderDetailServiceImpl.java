package com.example.demo.service.impl;

import com.example.demo.dao.OrderDetailMapper;
import com.example.demo.entity.OrderDetail;
import com.example.demo.service.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("orderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService{
    @Resource
    private OrderDetailMapper userDao;


    public OrderDetail getOrderDetailById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
