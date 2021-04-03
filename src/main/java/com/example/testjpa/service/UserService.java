package com.example.testjpa.service;

import com.example.testjpa.po.User;

import java.util.List;

public interface UserService {
    User saveBlog(User user);
    List<User> selectUserById(int id);
}
