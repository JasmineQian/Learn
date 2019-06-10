package com.example.demo.service.impl;

import com.example.demo.bean.Customer;
import com.example.demo.mapper.CustomerMapper;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Value("${sys.name}")
    private String uid;

    @Value("${sys.dateformat}")
    private String dateformat;

    @Value("${sys.PageSize}")
    private int pagesize;

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public int add(Customer customer) {
        int count = customerMapper.insert(customer);
        return count;
    }

    @Override
    public int update(Customer customer) {
        int count = customerMapper.update(customer);
        return count;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = customerMapper.findById(id);
        return customer;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> lists= customerMapper.findAll();
        return lists;
    }
}
