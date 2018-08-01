//package com.example.demo.controller;
//
//import com.example.demo.entity.User;
//import com.example.demo.service.UserService;
//import com.sun.tools.internal.ws.processor.model.Model;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
//@RestController
//@EnableAutoConfiguration
//@RequestMapping("/testboot")
//public class TestBootController {
//    @Resource
//    private UserService userService;
//
//    @RequestMapping("getuser")
//    public User getUser() {
//        User user = new User();
//        user.setUserName("test");
//        return user;
//    }
//
//    @RequestMapping("/showUser")
//    @ResponseBody
//    public User toIndex(HttpServletRequest request, Model model){
//        int userId = Integer.parseInt(request.getParameter("id"));
//        User user = this.userService.getUserById(userId);
//        return user;
//    }
//}
