package com.example.demo.mapper;


import com.example.demo.bean.Content;
import com.example.demo.bean.ContentUpdateRequest;

import java.util.List;

public interface ContentMapper {

    List<Content> getContents();

    Content getByid(int id);

    int insert(ContentUpdateRequest record);

    int updateById(ContentUpdateRequest record);
}
