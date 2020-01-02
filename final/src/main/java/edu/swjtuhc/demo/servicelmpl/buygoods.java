package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.buygoodsmapper;
import edu.swjtuhc.demo.model.goods;
import edu.swjtuhc.demo.servive.bugoodsservice;

@Service
public class buygoods implements bugoodsservice{
	@Autowired 
	buygoodsmapper buygoods;
	@Override
public int buygoods(goods good,Integer p) {
		
		// TODO Auto-generated method stub
		goods a0=buygoods.selectgoodssnamenumber(good.getGoodsname(), good.getGoodsnumber());
		
		int i=-1;
		if(a0!=null) {
		 i=buygoods.buygoods(good,p);
		}else {
			i=2;
		}
		return i;
	
	}

	}