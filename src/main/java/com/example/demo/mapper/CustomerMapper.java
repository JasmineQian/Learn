package com.example.demo.mapper;


import com.example.demo.bean.Customer;

import java.util.List;

public interface CustomerMapper {

    int insert(Customer customer);

    int update(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
