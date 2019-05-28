package com.example.demo.service;

import com.example.demo.bean.Content;
import com.example.demo.bean.ContentUpdateRequest;

import java.util.List;

public interface ContentService {

    List<Content> getAll();

    Content getByid(int id);

    int insert(ContentUpdateRequest content);

    int update(ContentUpdateRequest content);
}
