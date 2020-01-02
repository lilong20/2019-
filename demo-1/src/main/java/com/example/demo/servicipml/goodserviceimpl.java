package com.example.demo.servicipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.goodmapper;
import com.example.demo.model.goods;
import com.example.demo.service.goodsservice;

@Service
public class goodserviceimpl implements goodsservice{
@Autowired
goodmapper goodmapper;
public int register(goods goods) {
	goods gd=goodmapper.selectGoodByGoodname(goods.getGoodsname());
	
	int i = 3;
	if (gd!=null) {
		i=2;
	}else {
		i=1;
	}
	return i;	
}
}
