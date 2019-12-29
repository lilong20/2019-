package edu.swjtuhc.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.goodmapper;
import edu.swjtuhc.demo.mode.Good;
import edu.swjtuhc.demo.service.Goodservice;

@Service
public class goodserviceimpl implements Goodservice {
	@Autowired
	goodmapper goodapper;

	@Override
	public int register(Good good) {
		// TODO Auto-generated method stub
		
		Good gd=goodapper.selectGoodBygoodsname(good.getGoodsname());
		int i = 3;
		if (gd!=null) {
			i=2;
		}else {
			i=1;
		}
		return i;
	}
	

}
