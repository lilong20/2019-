package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.Goods;

@Mapper
public interface AddGoodsMapper {
	public Goods selectgoodsBygoodaname(String goodsname);
    public int insertgoods(Goods com);
}
