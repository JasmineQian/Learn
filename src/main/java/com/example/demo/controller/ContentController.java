package com.example.demo.controller;


import com.example.demo.bean.Content;
import com.example.demo.bean.ContentUpdateRequest;
import com.example.demo.service.ContentService;
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
@RequestMapping("content")
@Api(value = "对学习进行增删查改", description = "查询信息并对学习的信息进行增删查改", position = 0)
public class ContentController {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    ContentService contentService;

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "", name = "", value = "展示列表请求接口")
    @GetMapping(value = "/showall")
    public List<Content> findAll() {
        List<Content>  lists= contentService.getAll();
        return lists;
    }


    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "", name = "", value = "展示列表请求接口")
    @GetMapping(value = "/show/{id}")
    public Content findById(@PathVariable("id") int id) {
        Content content= contentService.getByid(id);
        return content;
    }

    @ApiOperation(value = "增加新的信息", notes = "增加新的信息")
    @ApiImplicitParam(dataType = "ContentUpdateRequest", name = "content", value = "content")
    @PostMapping(value = "/add")
    public int addContent(@RequestBody ContentUpdateRequest content) {
        int count= contentService.insert(content);
        return count;
    }


    @ApiOperation(value = "更新Content内容", notes = "更新Content内容")
    @ApiImplicitParam(dataType = "ContentUpdateRequest", name = "content", value = "增加content信息", required = true)
    @PostMapping(value = "/update")
    public int updateContent(@PathVariable("id") int id,@RequestBody ContentUpdateRequest content) {
        content.setId(id);
        int count = contentService.update(content);
        return count;
    }


}
