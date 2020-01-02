package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Goods;
import com.example.demo.service.AddGoodsSerivce;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Amdin")
public class AddGoodsController {
	@Autowired
	AddGoodsSerivce addGoodsSerivce;
@RequestMapping("/Add")
   public JSONObject add (Goods com) {
	   JSONObject result =new JSONObject();
	    int i=addGoodsSerivce.add(com);
	result.put("state",i);
	return result;
}

}
