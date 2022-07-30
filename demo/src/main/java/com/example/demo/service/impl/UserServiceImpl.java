package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


//    public String login(User inputUser) {
//        System.out.println("========1");
////        User user =  userMapper.login(inputUser);
//        User u = userMapper.login(inputUser);
//
//        if(u!=null) {

//        }
//
//
//
//    }


    //登录用户
    public User login(User user) {
        return userMapper.login(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    private String createToken(){
        return System.currentTimeMillis()+"";
    }

}
