package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.ShopCar;
import com.example.demo.service.ShopCarService;
import com.example.demo.utils.ResponseEnum;
import com.example.demo.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/ShopCar")
public class ShopCarController {
    @Autowired
    private ShopCarService shopCarService;

    @RequestMapping("/queryGoods")
    @ResponseBody
    public JSONObject queryGoods(HttpServletRequest request){
        try {
            String goodId = request.getParameter("goodsId");
            ShopCar good = this.shopCarService.getShopCarById(goodId);
            return WebUtils.createSuccResult(good);
        } catch (Exception e) {
            return WebUtils.createErrorResult(ResponseEnum.FAILURE);
        }
    }
}
