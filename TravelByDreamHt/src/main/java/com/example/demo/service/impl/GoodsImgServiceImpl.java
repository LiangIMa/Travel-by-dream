package com.example.demo.service.impl;

import com.example.demo.dao.GoodsImgMapper;
import com.example.demo.entity.GoodsImg;
import com.example.demo.service.GoodsImgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsImgService")
public class GoodsImgServiceImpl implements GoodsImgService{
    @Resource
    private GoodsImgMapper goodsImgDao;
    public GoodsImg getGoodsImgById(String userId) {
        return goodsImgDao.selectByPrimaryKey(userId);
    }

    public int insertImgList(List<GoodsImg> goodsImgList) {
        return goodsImgDao.insertImgList(goodsImgList);
    }

    public List<GoodsImg> selectGoodsImgById(String goodsId) {
        return goodsImgDao.selectGoodsImgById(goodsId);
    }
}
