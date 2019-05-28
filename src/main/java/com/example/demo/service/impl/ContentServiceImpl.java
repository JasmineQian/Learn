package com.example.demo.service.impl;

import com.example.demo.bean.Content;
import com.example.demo.bean.ContentUpdateRequest;
import com.example.demo.mapper.ContentMapper;
import com.example.demo.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContentServiceImpl implements ContentService {

    @Value("${sys.name}")
    private String uid;

    @Value("${sys.dateformat}")
    private String dateformat;

    @Value("${sys.PageSize}")
    private int pagesize;

    @Autowired
    private ContentMapper contentMapper;


    @Override
    public List<Content> getAll() {
        List<Content> list= contentMapper.getContents();
        return list;
    }

    @Override
    public Content getByid(int id) {
        Content content  = contentMapper.getByid(id);
        return content;
    }

    @Override
    public int insert(ContentUpdateRequest content) {
        int count = contentMapper.insert(content);
        return count;
    }


    @Override
    public int update(ContentUpdateRequest content) {
        int count = contentMapper.updateById(content);
        return count;
    }
}
