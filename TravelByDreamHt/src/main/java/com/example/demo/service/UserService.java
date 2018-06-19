package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;
public interface UserService {
    public User getUserById(int userId);

    boolean addUser(User record);
}
