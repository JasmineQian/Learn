package com.example.demo.service;

import com.example.demo.bean.Work;

import java.util.List;

public interface WorkService {

    List<Work> getAll();

    Work getByid(int id);

    int insert(Work work);

    int update(Work work);
}
