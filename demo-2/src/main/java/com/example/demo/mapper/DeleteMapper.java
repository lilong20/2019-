package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface DeleteMapper {
	public int deletecomBygoodsname(String goodsnames);

}
