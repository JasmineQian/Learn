package com.example.demo.service.impl;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insert(User user) {
        int count = userMapper.insert(user);
        return count;
    }

    @Override
    public User getByUsername(String username) {
        User user_searchresult = userMapper.getByName(username);
        System.out.println(user_searchresult);
        return user_searchresult;
    }

    @Override
    public int checkUsername(String username) {
        return 0;
    }
}
