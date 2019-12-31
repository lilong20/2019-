package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.mode.Good;

@Mapper
public interface goodmapper {
	public Good selectGoodBygoodsname(String goodsname);
	
}
