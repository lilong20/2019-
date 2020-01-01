package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Collect;

@Mapper
public interface CollectMapper {

 public int insertlike(Collect like);

}
