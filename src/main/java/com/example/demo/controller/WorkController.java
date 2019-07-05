package com.example.demo.controller;

import com.example.demo.bean.ResponseBean;
import com.example.demo.bean.Work;
import com.example.demo.service.WorkService;
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
@RequestMapping("api/work")
//@RequestMapping("work")
@Api(value = "对工作进行增删查改", description = "对工作进行增删查改", position = 0)
public class WorkController {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    WorkService workService;

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "", name = "", value = "展示列表请求接口")
    @GetMapping(value = "/showall")
    public ResponseBean<Work> findAll() {
        ResponseBean responseBean = new ResponseBean();
        List<Work>  lists= workService.getAll();
        System.out.println(lists);
        responseBean.setData(lists);
        return responseBean;
    }

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "", name = "", value = "展示列表请求接口")
    @GetMapping(value = "/show/{id}")
    public ResponseBean findById(@PathVariable("id") int id) {
        ResponseBean responseBean = new ResponseBean();
        Work work= workService.getByid(id);
        responseBean.setData(work);
        return responseBean;
    }


    @ApiOperation(value = "增加新的信息", notes = "增加新的信息")
    @ApiImplicitParam(dataType = "ContentUpdateRequest", name = "content", value = "content")
    @PostMapping(value = "/add")
    public ResponseBean addWork(@RequestBody Work work) {
        ResponseBean responseBean = new ResponseBean();
        int count= workService.insert(work);
        responseBean.setData(count);
        return responseBean;
    }


    @ApiOperation(value = "更新Content内容", notes = "更新Content内容")
    @ApiImplicitParam(dataType = "ContentUpdateRequest", name = "content", value = "增加content信息", required = true)
    @PostMapping(value = "/update/{id}")
    public ResponseBean updateContent(@PathVariable("id") int id,@RequestBody Work work) {
        work.setId(id);
        System.out.println(work);
        ResponseBean responseBean= new ResponseBean();
        int count = workService.update(work);
        responseBean.setData(count);
        return responseBean;
    }

}
