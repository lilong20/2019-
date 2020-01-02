package com.example.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CollectMapper;
import com.example.demo.model.Collect;
import com.example.demo.model.Goods;
import com.example.demo.service.CollectService;

@Service

public class CollectServicelmpl implements CollectService {
@Autowired 
   CollectMapper  collectMapper;

	@Override
	public int collectliek(Collect like) {
		// TODO Auto-generated method stub
		
		Goods u0 = collectMapper.collectBygoodsname(like.getGoodsname());
		int i =-1;
		if (u0==null) {
			i = collectMapper.insertlove(like);
		}else {
			i=2;
		}
		
		return i;
	}


}
