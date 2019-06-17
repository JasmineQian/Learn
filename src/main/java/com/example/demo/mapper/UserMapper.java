package com.example.demo.mapper;

import com.example.demo.bean.User;

public interface UserMapper {

    User getByid(int id);

    User getByName(String username);

    int insert(User user);

    int updateById(User user);
}
