package com.example.demo.service.impl;

import com.example.demo.bean.Content;
import com.example.demo.bean.ContentUpdateRequest;
import com.example.demo.bean.Work;
import com.example.demo.mapper.ContentMapper;
import com.example.demo.mapper.WorkMapper;
import com.example.demo.service.ContentService;
import com.example.demo.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WorkServiceImpl implements WorkService {

    @Value("${sys.name}")
    private String uid;

    @Value("${sys.dateformat}")
    private String dateformat;


    @Autowired
    private WorkMapper workMapper;


    @Override
    public List<Work> getAll() {
        List<Work> lists = workMapper.getWorks();
        return lists;
    }

    @Override
    public Work getByid(int id) {
        Work work = workMapper.getByid(id);
        return work;
    }

    @Override
    public int insert(Work work) {
        int count = workMapper.insert(work);
        return count;
    }

    @Override
    public int update(Work work) {
        int count = workMapper.updateById(work);
        return count;
    }
}
