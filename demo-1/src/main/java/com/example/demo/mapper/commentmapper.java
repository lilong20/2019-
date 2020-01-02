package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.comment;

@Mapper
public interface commentmapper {
public int insertcomment(comment comment);
}
