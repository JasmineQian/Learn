package com.example.demo.controller;


import com.example.demo.bean.ContentUpdateRequest;
import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Validated
@RestController
@RequestMapping("api")
//@Api(value = "注册和更新用户信息", description = "注册和更新用户信息", position = 0)
public class UserController {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;



    @ApiOperation(value = "增加新的用户", notes = "注册新的用户")
    @ApiImplicitParam(dataType = "User", name = "user", value = "user")
    @PostMapping(value = "/register")
    public int addContent(@RequestBody User user) {
        int count= userService.insert(user);
        return count;
    }



}
