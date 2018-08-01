package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.ResponseEnum;
import com.example.demo.utils.WebUtils;
import com.sun.tools.internal.ws.processor.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        System.out.println(user.getUserId());
        return user;
    }
    @RequestMapping("/loginByUsername")
    @ResponseBody
    public User loginByUsername(HttpServletRequest request){
        String username = request.getParameter("username");
        User user = this.userService.getUserByName(username);
        System.out.println(user);
        return user;
    }

    @RequestMapping("/register")
    @ResponseBody
    public JSONObject register(HttpServletRequest request) {
        try{
            String username = request.getParameter("name");
            User hasUser = this.userService.getUserByName(username);
            if(hasUser != null){
                return WebUtils.createErrorResult(ResponseEnum.FAILURE);
            }
            User user = new User();
            user.setUserName(username);
            user.setUserPhone(request.getParameter("phone"));
            user.setUserPw(request.getParameter("password"));
            user.setUserSex(request.getParameter("sex"));
            user.setUserType(request.getParameter("type"));
            int insertSuccess = this.userService.addUser(user);
            if(insertSuccess > 0){
                return WebUtils.createSuccResult();
            }else{
                return WebUtils.createErrorResult();
            }
        }catch(Exception e){
            return WebUtils.createErrorResult(ResponseEnum.FAILURE);
        }
    }
}
