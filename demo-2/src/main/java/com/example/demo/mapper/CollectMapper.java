package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.Collect;
import com.example.demo.model.Goods;
import com.example.demo.model.SysUser;

@Mapper
public interface CollectMapper {
	public Goods  collectBygoodsname(String goodsname);
     public int insertlove(Collect like);

}
