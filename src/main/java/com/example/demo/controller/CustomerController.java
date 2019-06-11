package com.example.demo.controller;


import com.example.demo.bean.Customer;
import com.example.demo.service.CustomerService;
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
@RequestMapping("api/")
@Api(value = "用户的新增和减少", description = "查询信息并对学习的信息进行增删查改", position = 0)
public class CustomerController {

    // 记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    CustomerService customerService;

    @ApiOperation(value = "展示列表请求接口", notes = "展示列表请求接口")
    @ApiImplicitParam(dataType = "Customer", name = "Customer", value = "展示列表请求接口")
    @PostMapping(value = "/users")
    public int users(@RequestBody Customer customer) {
        System.out.println(customer);
        int count = customerService.add(customer);
        return count;

    }


    @ApiOperation(value = "展示对应id的会员信息", notes = "展示对应id的会员信息")
    @ApiImplicitParam(dataType = "", name = "", value = "展示对应id的会员信息")
    @GetMapping(value = "/users/{id}")
    public Customer usersid(@PathVariable("id") int id) {
        Customer customer= customerService.findById(id);
        return customer;
    }


    @ApiOperation(value = "展示对应id的会员信息", notes = "展示对应id的会员信息")
    @ApiImplicitParam(dataType = "", name = "", value = "展示对应id的会员信息")
    @PutMapping(value = "/edit/{id}")
    public int edit(@PathVariable("id") int id,@RequestBody Customer customer) {
        System.out.println(customer);
        customer.setId(id);
        int count= customerService.update(customer);
        return count;
    }


    @ApiOperation(value = "展示所有的用户信息", notes = "展示所有的用户信息")
    @ApiImplicitParam(dataType = "", name = "", value = "展示所有的用户信息")
    @GetMapping(value = "/showall")
    public List<Customer> showall() {
        List<Customer> customers= customerService.findAll();
        return customers;
    }
}
