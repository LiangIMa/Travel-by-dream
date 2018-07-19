package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Goods;
import com.example.demo.entity.GoodsImg;
import com.example.demo.entity.ShopCar;
import com.example.demo.service.GoodsService;
import com.example.demo.service.ShopCarService;
import com.example.demo.utils.PageUtils;
import com.example.demo.utils.QiNiuUtils;
import com.example.demo.utils.UUIDUtils;
import com.example.demo.utils.WebUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private ShopCarService shopCarService;

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
    public JSONObject getGoods(HttpServletRequest request){
        int pageNum = Integer.parseInt(request.getParameter("pageNum"));
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        int totalNums = this.goodsService.selectGoods().size();
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goodsList = this.goodsService.selectGoods();
        PageUtils<Goods> pageData = new PageUtils<>(pageNum, pageSize, totalNums);
        pageData.setItems(goodsList);
        return WebUtils.createSuccResult(goodsList,totalNums);
    }

    @RequestMapping("/deleteGoods")
    @ResponseBody
    public Map deleteGoods(HttpServletRequest request){
        String goodsId = request.getParameter("goodsId");
        int isSuccess = this.goodsService.deleteGoods(goodsId);
        Map resaultMap = new HashMap();
        if(isSuccess > 0){
            resaultMap.put("success","true");
        }else {
            resaultMap.put("success","false");
        }
        return resaultMap;
    }

    @RequestMapping("/updataGoods")
    @ResponseBody
    public Map updataGoods(HttpServletRequest request){
        Goods goods = new Goods();
        goods.setGoodsName(request.getParameter("goodsName"));
        goods.setGoodsEndate(request.getParameter("goodsEndate"));
        goods.setGoodsPosition(request.getParameter("goodsPosition"));
        goods.setUserContact(request.getParameter("userContact"));
        goods.setGoodsNum(Integer.parseInt(request.getParameter("goodsNum")));
        goods.setGoodsPrice(Double.parseDouble(request.getParameter("goodsPrice")));
        goods.setGoodsTitle(request.getParameter("goodsTitle"));
        goods.setGoodsDesc(request.getParameter("goodsDesc"));
        goods.setGoodsId(request.getParameter("goodsId"));
//        更新购物车数据
        ShopCar carGoods = new ShopCar();
        carGoods.setGoodsId(request.getParameter("goodsId"));
        carGoods.setGoodsName(request.getParameter("goodsName"));
        carGoods.setGoodsPrice(Double.parseDouble(request.getParameter("goodsPrice")));
        carGoods.setGoodsTotal(Integer.parseInt(request.getParameter("goodsNum")));
        int isSuccess = this.goodsService.updataGoods(goods);
        int updataShopCar = this.shopCarService.updataGoodsInfo(carGoods);
        Map resaultMap = new HashMap();
        if(isSuccess > 0){
            resaultMap.put("success","true");
        }else {
            resaultMap.put("success","false");
        }
        return resaultMap;
    }

    @RequestMapping("/handleOnShelf")
    @ResponseBody
    public Map handleOnShelf(HttpServletRequest request){
        String goodsId = request.getParameter("goodsId");
        int isSuccess = this.goodsService.handleOnShelf(goodsId);
        int updataShopCar = this.shopCarService.handleOnShelf(goodsId);
        Map resaultMap = new HashMap();
        if(isSuccess > 0){
            resaultMap.put("success","true");
        }else {
            resaultMap.put("success","false");
        }
        return resaultMap;
    }

    @RequestMapping("/handleOffShelf")
    @ResponseBody
    public Map handleOffShelf(HttpServletRequest request){
        String goodsId = request.getParameter("goodsId");
        int isSuccess = this.goodsService.handleOffShelf(goodsId);
        int updataShopCar = this.shopCarService.handleOffShelf(goodsId);
        Map resaultMap = new HashMap();
        if(isSuccess > 0){
            resaultMap.put("success","true");
        }else {
            resaultMap.put("success","false");
        }
        return resaultMap;
    }
}
