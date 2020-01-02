package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Collect;
import com.example.demo.service.CollectService;

import net.sf.json.JSONObject;

@RestController

@RequestMapping("/user")
public class CollectController {
	@Autowired
	CollectService collectService;
 @RequestMapping("/love")
 
 public JSONObject collect(@RequestBody Collect like) {
		
	  JSONObject result = new JSONObject();
 	 
 	 //调用sevice
        int i =collectService.collectliek(like);
        result.put("text",i);
 	return result;
 	}
}
