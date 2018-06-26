package com.example.demo.controller;

import com.example.demo.entity.GoodsImg;
import com.example.demo.service.GoodsImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/goodsImg")
public class GoodsImgController {
    @Autowired
    private GoodsImgService goodsImgService;

    @RequestMapping("/showGoodsImg")
    @ResponseBody
    public GoodsImg toIndex(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        GoodsImg user = this.goodsImgService.getGoodsImgById(userId);
        // System.out.println(user.getId());
        return user;
    }
}
