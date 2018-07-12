package com.example.demo.service;

import com.example.demo.entity.GoodsImg;

import java.util.List;

public interface GoodsImgService {
    public GoodsImg getGoodsImgById(String userId);
    // 插入图片
    public int insertImgList(List<GoodsImg> goodsImgList);

    public List<GoodsImg> selectGoodsImgById(String goodsId);
}
