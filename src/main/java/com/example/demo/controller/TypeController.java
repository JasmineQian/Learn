package com.example.demo.controller;

import com.example.demo.bean.Type;
import com.example.demo.service.TypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping("type")
@Api(value = "学习的类型", description = "学习的种类", position = 0)
public class TypeController {


    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    TypeService typeService;

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "", name = "", value = "展示列表请求接口")
    @GetMapping(value = "/showall")
    public List<Type> findAll() {
        List<Type>  lists= typeService.getAll();
        return lists;
    }
}
