package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.comment;
import com.example.demo.service.commentservice;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class commentcontroller {
	
	@Autowired
	commentservice commentservice;
	@RequestMapping("/comment")
	public JSONObject select(@RequestBody comment comment) {
		JSONObject result=new JSONObject();
		
		int i =commentservice.register(comment);
		
		result.put("state", i);
		return result;
	}
}
