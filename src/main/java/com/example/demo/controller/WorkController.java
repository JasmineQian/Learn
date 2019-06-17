package com.example.demo.controller;


import com.example.demo.bean.Work;
import com.example.demo.service.WorkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Validated
@RestController
//@RequestMapping("api/content")
@RequestMapping("work")
@Api(value = "对工作进行增删查改", description = "对工作进行增删查改", position = 0)
public class WorkController {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    WorkService workService;

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "", name = "", value = "展示列表请求接口")
    @GetMapping(value = "/showall")
    public List<Work> findAll() {
        List<Work>  lists= workService.getAll();
        System.out.println(lists);
        return lists;
    }
}
