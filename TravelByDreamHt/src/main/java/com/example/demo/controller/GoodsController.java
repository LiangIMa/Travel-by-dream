package com.example.demo.controller;

import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
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
        int goodsId = Integer.parseInt(request.getParameter("id"));
        Goods goods = this.goodsService.getUserById(goodsId);
        // System.out.println(user.getId());
        return goods;
    }
}
