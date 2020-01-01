package com.example.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CollectMapper;
import com.example.demo.model.Collect;
import com.example.demo.service.CollectService;

@Service

public class CollectServicelmpl implements CollectService {
 @Autowired
 CollectMapper collectMapper;
	@Override
	public int collectlover(Collect like) {
		// TODO Auto-generated method stub
		int i=1;
		i=collectMapper.insertlike(like);

		return i;
	}


}
