package com.example.demo.controller;

import com.example.demo.entity.OrderDetail;
import com.example.demo.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/OrderDetail")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;

    @RequestMapping("/showOrderDetail")
    @ResponseBody
    public OrderDetail toIndex(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        OrderDetail user = this.orderDetailService.getOrderDetailById(userId);
        // System.out.println(user.getId());
        return user;
    }
}
