package com.example.demo.service;

import com.example.demo.bean.Type;

import java.util.List;

public interface TypeService {

    List<Type> getAll();

    Type getByid(int id);
}
