package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.ShopCar;
import com.example.demo.service.ShopCarService;
import com.example.demo.utils.ResponseEnum;
import com.example.demo.utils.UUIDUtils;
import com.example.demo.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/ShopCar")
public class ShopCarController {
    @Autowired
    private ShopCarService shopCarService;

    @RequestMapping("/queryGoods")
    @ResponseBody
    public JSONObject queryGoods(HttpServletRequest request){
        //按goodsId查找，用戶添购物车时查看购物车是否有重复商品
        try {
            String goodId = request.getParameter("goodsId");
            ShopCar good = this.shopCarService.getShopCarById(goodId);
            return WebUtils.createSuccResult(good);
        } catch (Exception e) {
            return WebUtils.createErrorResult(ResponseEnum.FAILURE);
        }
    }

    @RequestMapping("/insertGoods")
    @ResponseBody
    public JSONObject insertGoods(HttpServletRequest request){
        try {
            ShopCar goods = new ShopCar();
            goods.setCarId(UUIDUtils.getUUID());
            goods.setGoodsName(request.getParameter("goodsName"));
            goods.setUserId(Integer.parseInt(request.getParameter("userId")));
            goods.setGoodsId(request.getParameter("goodsId"));
            goods.setGoodsImg(request.getParameter("goodsImg"));
            goods.setGoodsPrice(Double.parseDouble(request.getParameter("goodsPrice")));
            goods.setGoodsNum(Integer.parseInt(request.getParameter("goodsNum")));
            goods.setGoodsTotal(Integer.parseInt(request.getParameter("goodsTotal")));
            // goods.setTotalPrice(Double.parseDouble(request.getParameter("totalPrice")));
            goods.setState(Integer.parseInt(request.getParameter("state")));
            int good = this.shopCarService.insertGoods(goods);
            if(good > 0){
                return WebUtils.createSuccResult();
            }else{
                return WebUtils.createErrorResult();
            }
        } catch (Exception e) {
            return WebUtils.createErrorResult(ResponseEnum.FAILURE);
        }
    }

    @RequestMapping("/updataGoods")
    @ResponseBody
    public JSONObject updataGoods(HttpServletRequest request){
        try {
            ShopCar goods = new ShopCar();
            goods.setGoodsId(request.getParameter("goodsId"));
            goods.setGoodsNum(Integer.parseInt(request.getParameter("goodsNum")));
            goods.setGoodsTotal(Integer.parseInt(request.getParameter("goodsTotal")));
            int good = this.shopCarService.updataGoods(goods);
            if(good > 0){
                return WebUtils.createSuccResult();
            }else{
                return WebUtils.createErrorResult();
            }
        } catch (Exception e) {
            return WebUtils.createErrorResult(ResponseEnum.FAILURE);
        }
    }

    @RequestMapping("/queryCarGoodsByUser")
    @ResponseBody
    public JSONObject queryCarGoodsByUser(HttpServletRequest request){
        // 查找用户购物车所有商品
        try {
            int userId = Integer.parseInt(request.getParameter("userId"));
            List<ShopCar> goodsList = this.shopCarService.queryCarGoodsByUser(userId);
            return WebUtils.createSuccResult(goodsList);
        } catch (Exception e) {
            return WebUtils.createErrorResult(ResponseEnum.FAILURE);
        }
    }
}
