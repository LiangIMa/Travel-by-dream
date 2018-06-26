package com.example.demo.service.impl;

import com.example.demo.dao.GoodsImgMapper;
import com.example.demo.entity.GoodsImg;
import com.example.demo.service.GoodsImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("goodsImgService")
public class GoodsImgServiceImpl implements GoodsImgService{
    @Resource
    private GoodsImgMapper goodsDao;
    public GoodsImg getGoodsImgById(int userId) {
        return goodsDao.selectByPrimaryKey(userId);
    }
}
