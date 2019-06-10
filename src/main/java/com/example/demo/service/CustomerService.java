package com.example.demo.service;

import com.example.demo.bean.Customer;

import java.util.List;

public interface CustomerService {

    int add(Customer customer);

    int update(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
