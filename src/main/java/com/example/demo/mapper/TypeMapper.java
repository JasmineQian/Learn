package com.example.demo.mapper;

import com.example.demo.bean.Type;

import java.util.List;

public interface TypeMapper {

    List<Type> getTypes();

    Type getByid(int id);

}
