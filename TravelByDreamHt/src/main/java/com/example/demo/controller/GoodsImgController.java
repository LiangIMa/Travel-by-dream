package com.example.demo.controller;

import com.example.demo.entity.GoodsImg;
import com.example.demo.service.GoodsImgService;
import com.example.demo.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/goodsImg")
public class GoodsImgController {
    @Autowired
    private GoodsImgService goodsImgService;

    @RequestMapping("/showGoodsImg")
    @ResponseBody
    public GoodsImg toIndex(HttpServletRequest request){
        String userId = request.getParameter("id");
        GoodsImg user = this.goodsImgService.getGoodsImgById(userId);
        // System.out.println(user.getId());
        return user;
    }

    @RequestMapping("/setImg")
    @ResponseBody
    public Map setImg(HttpServletRequest request){
        List<GoodsImg> goodsImgList = new ArrayList<GoodsImg>();
        for(int i = 1; i <= 3; i++){
            GoodsImg goodsImg = new GoodsImg();
            goodsImg.setGoodsId(request.getParameter("imgId"));
            goodsImg.setImgId(UUIDUtils.getUUID());
            goodsImg.setImgUrl(request.getParameter("img" + i));
            System.out.println(request.getParameter("img" + i));
            goodsImgList.add(goodsImg);
        }
        int success = this.goodsImgService.insertImgList(goodsImgList);
        Map resaultMap = new HashMap();
        if(success > 0){
            resaultMap.put("success","true");
        }else {
            resaultMap.put("success","false");
        }
        return resaultMap;
    }
}
