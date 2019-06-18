package com.example.demo.service.impl;

import com.example.demo.bean.Type;
import com.example.demo.mapper.TypeMapper;
import com.example.demo.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TypeServiceImpl implements TypeService {


    @Value("${sys.name}")
    private String uid;

    @Value("${sys.dateformat}")
    private String dateformat;

    @Value("${sys.PageSize}")
    private int pagesize;

    @Autowired
    TypeMapper typeMapper;

    @Override
    public List<Type> getAll() {
       List<Type> lists= typeMapper.getTypes();
       return lists;
    }

    @Override
    public Type getByid(int id) {
        Type type = typeMapper.getByid(id);
        return type;
    }

    @Override
    public int add(Type type) {
        int count = typeMapper.insert(type);
        return count;
    }

    @Override
    public int addBatch(List<Type> lists) {
        int count = typeMapper.insertBatch(lists);
        return count;
    }
}
