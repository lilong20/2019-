package com.example.demo.service;

import java.io.InputStream;
import java.util.List;

import com.example.demo.model.dairy;

public interface dairyservice {
	public List<dairy> getdairyList();
	
	public int creatdairy(dairy dairy, InputStream fileStream);
}
