package com.example.demo.servicipml;

import java.io.InputStream;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.mapper.dairymapper;
import com.example.demo.model.dairy;
import com.example.demo.service.dairyservice;

@Service
public class dairyserviceimpl implements dairyservice {
	
	@Autowired
	dairymapper dairymapper;
	@Override
	public List<dairy> getdairyList() {
		// TODO Auto-generated method stub
		return dairymapper.selectAllDairies();
	}
	
	@Override
	public int creatdairy(dairy dairy, InputStream fileStream) {
		// TODO Auto-generated method stub
		int i =dairymapper.insertdairy(dairy);
		return i;
	}

}
