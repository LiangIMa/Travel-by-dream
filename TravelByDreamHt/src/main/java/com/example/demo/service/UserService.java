package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;
public interface UserService {
    // 根据用户id查询
    public User getUserById(int userId);
    // 用户登录验证
    public User getUserByName(String username);

    int addUser(User record);

//    public int register(User user);

}
