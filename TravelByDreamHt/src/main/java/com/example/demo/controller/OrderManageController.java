package com.example.demo.controller;

import com.example.demo.entity.OrderManage;
import com.example.demo.service.OrderManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/OrderManage")
public class OrderManageController {
    @Autowired
    private OrderManageService userService;

    @RequestMapping("/showOrderManage")
    @ResponseBody
    public OrderManage toIndex(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        OrderManage user = this.userService.getOrderManageById(userId);
        // System.out.println(user.getId());
        return user;
    }
}
