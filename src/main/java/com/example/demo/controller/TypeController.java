package com.example.demo.controller;

import com.example.demo.bean.ResponseBean;
import com.example.demo.bean.Type;
import com.example.demo.service.TypeService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
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
//@RequestMapping("api/type")
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
    public ResponseBean<Type> findAll() {
        ResponseBean responseBean = new ResponseBean();
        List<Type>  lists= typeService.getAll();
        responseBean.setData(lists);
        return responseBean;
    }

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "", name = "", value = "展示列表请求接口")
    @PostMapping(value = "/add")
    public ResponseBean add(@RequestBody Type type) {
        ResponseBean responseBean = new ResponseBean();
        int count = typeService.add(type);
        responseBean.setData(count);
        return responseBean;
    }


    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "", name = "", value = "展示列表请求接口")
    @PostMapping(value = "/addBatch")
    public int addBatch(@RequestBody List<Type> list) {
        int size = list.size();
        for(int i=size-1;i>=0;i--){
           if(list.get(i).getName() ==null || list.get(i).getName() =="")
               list.remove(i);
        }
        if(list.size()<1){
            return 0;}
            else {
        int count = typeService.addBatch(list);

        return count;
    }
}}
