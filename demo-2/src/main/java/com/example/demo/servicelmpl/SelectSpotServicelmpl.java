package com.example.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.SelectSpotMapper;
import com.example.demo.model.SelectSpot;
import com.example.demo.service.SelectSpotService;

@Service
public class SelectSpotServicelmpl implements SelectSpotService {
@ Autowired
SelectSpotMapper selectSpotMapper;
 
@Override
public int selectji(SelectSpot spot) {
	// TODO Auto-generated method stub
	SelectSpot u0 = selectSpotMapper.selectSpotByViewname(spot.getViewname());
	int i=-1 ;
	if (u0==null) {
	   i=1;
	}else {
		i=2;
	}		
	return i;
}
	
	

}
