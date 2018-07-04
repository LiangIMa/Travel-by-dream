package com.example.demo.controller;

import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import com.example.demo.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/showGoods")
    @ResponseBody
    public Goods toIndex(HttpServletRequest request){
        String goodsId = request.getParameter("id");
        Goods goods = this.goodsService.getUserById(goodsId);
        // System.out.println(user.getId());
        return goods;
    }

    @RequestMapping("/goodsUpload")
    @ResponseBody
    public String goodsUpload(HttpServletRequest request){
        Goods goods = new Goods();
        goods.setGoodsName(request.getParameter("name"));
        goods.setGoodsEndate(request.getParameter("enDate"));
        goods.setGoodsStartdate(request.getParameter("startDate"));
        goods.setGoodsPosition(request.getParameter("position"));
        goods.setUserContact(request.getParameter("contact"));
        goods.setGoodsNum(Integer.parseInt(request.getParameter("num")));
        goods.setGoodsPrice(Double.parseDouble(request.getParameter("price")));
        goods.setGoodsTitle(request.getParameter("title"));
        goods.setGoodsDesc(request.getParameter("desc"));
        goods.setGoodsState(request.getParameter("state"));
        goods.setUserId(Integer.parseInt(request.getParameter("userId")));
        String goodsId = UUIDUtils.getUUID();
        goods.setGoodsId(goodsId);
        int isSuccess = this.goodsService.insertGoods(goods);
        System.out.println("e9b1318a813a43a9aa363af3c9adabe1");
        return goodsId;

    }
}
