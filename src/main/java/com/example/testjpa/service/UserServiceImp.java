package com.example.testjpa.service;

import com.example.testjpa.po.User;
import com.example.testjpa.reposity.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    UserReposity userReposity;
    @Override
    public User saveBlog(User user) {
        return userReposity.save(user);
    }


    public List<User> selectUserById(int id)
    {
        return userReposity.selectById(id);
    }
}
