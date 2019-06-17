package com.example.demo.mapper;

import com.example.demo.bean.Work;

import java.util.List;

public interface WorkMapper {

    List<Work> getWorks();

    Work getByid(int id);

    int insert(Work record);

    int updateById(Work record);
}
