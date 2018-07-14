package com.example.demo.controller;

import com.example.demo.entity.Goods;
import com.example.demo.entity.GoodsImg;
import com.example.demo.service.GoodsService;
import com.example.demo.utils.QiNiuUtils;
import com.example.demo.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/getGoodsById")
    @ResponseBody
    public Goods toIndex(HttpServletRequest request){
        String goodsId = request.getParameter("goodsId");
        Goods goods = this.goodsService.getUserById(goodsId);
        // System.out.println(user.getId());
        return goods;
    }
    @RequestMapping("/getMySales")
    @ResponseBody
    public List<Goods> getMySales(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("userId"));
        List<Goods> goodsList = this.goodsService.getGoodByUserId(userId);
        // System.out.println(user.getId());
        return goodsList;
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
        goods.setGoodsUrl(request.getParameter("goodsUrl"));
        String goodsId = UUIDUtils.getUUID();
        goods.setGoodsId(goodsId);
        int isSuccess = this.goodsService.insertGoods(goods);
        System.out.println(goodsId);
        return goodsId;
    }

    @RequestMapping("/getTokn")
    @ResponseBody
    public String getTokn(HttpServletRequest request){
       String token = QiNiuUtils.getUpToken();
       System.out.println(token);
       return token;
    }

    @RequestMapping("/getGoods")
    @ResponseBody
    public List<Goods> getGoods(HttpServletRequest request){
        List<Goods> goodsList = this.goodsService.selectGoods();
        return goodsList;
    }
}
