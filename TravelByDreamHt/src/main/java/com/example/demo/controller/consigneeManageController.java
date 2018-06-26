package com.example.demo.controller;

import com.example.demo.entity.consigneeManage;
import com.example.demo.service.consigneeManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("/consigneeManage")
public class consigneeManageController {
    @Autowired
    private consigneeManageService consigneeService;

    @RequestMapping("/showConsigneeManage")
    @ResponseBody
    public consigneeManage toIndex(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        consigneeManage user = this.consigneeService.getConsigneeManageById(userId);
        // System.out.println(user.getId());
        return user;
    }
}
