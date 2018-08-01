package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;

    // 根据用户id查询
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
    // 用户登录验证
    public User getUserByName(String username) {
        return userDao.selectByUsername(username);
    }

    public int addUser(User record){

        return userDao.insertSelective(record);

    }

//    public int register(User user) {
//        return userDao.register(user);
//    }

}
