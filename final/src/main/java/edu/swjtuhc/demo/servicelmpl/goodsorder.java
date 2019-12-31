package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.buygoodsmapper;
import edu.swjtuhc.demo.mapper.ordermapper;
import edu.swjtuhc.demo.model.order;
import edu.swjtuhc.demo.servive.orders;

@Service
public class goodsorder implements orders{
@Autowired 
ordermapper orderadd;

	@Override
	public int goodsorder(order order) {
		// TODO Auto-generated method stub
	int i=orderadd.addoder(order);
		
		return i;
	}

}
