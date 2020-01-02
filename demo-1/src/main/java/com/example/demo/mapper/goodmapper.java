package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.goods;

@Mapper
public interface goodmapper {
public goods selectGoodByGoodname(String goodsname);
}
