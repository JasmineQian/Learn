package com.example.demo.service;

import com.example.demo.bean.User;

public interface UserService {

    /**
     * 添加新用户
     *
     * username 唯一， 默认 USER 权限
     */
    int insert(User user);

    /**
     * 查询用户信息
     * @param username 账号
     * @return UserEntity
     */
    User getByUsername(String username);

    int checkUsername(String username);
}
