package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.goods;
import com.example.demo.service.goodsservice;


import net.sf.json.JSONObject;
@RestController
@RequestMapping("/goods")
public class goodcontroller {

	@Autowired
goodsservice goodservice;
	@RequestMapping("/select")
	public JSONObject select(@RequestBody goods good) {
		JSONObject result=new JSONObject();
		
		int i =goodservice.register(good);
		if (i==2) {
			System.out.println("商品存在！");
		}
		result.put("state", i);
		return result;
	}	
}
