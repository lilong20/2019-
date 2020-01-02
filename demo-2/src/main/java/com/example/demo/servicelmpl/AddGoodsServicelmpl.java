package com.example.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AddGoodsMapper;
import com.example.demo.model.Goods;
import com.example.demo.service.AddGoodsSerivce;
@Service
public class AddGoodsServicelmpl implements AddGoodsSerivce{
@Autowired
AddGoodsMapper addGoodsMapper;
	@Override
	public int add(Goods com) {
		// TODO Auto-generated method stub
		Goods  u0= addGoodsMapper.selectgoodsBygoodaname(com.getGoodsname());
		 int i ;
		 if (u0==null) {
			i=addGoodsMapper.insertgoods(com);
		}else {
			i=2;
		}
		
		return i;
	}

}
