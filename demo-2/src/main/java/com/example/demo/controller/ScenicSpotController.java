package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.SelectSpotMapper;
import com.example.demo.model.SelectSpot;
import com.example.demo.service.SelectSpotService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/ScenicSpot")
public class ScenicSpotController {
@Autowired
SelectSpotService selectSpotService;
@RequestMapping("/SelectSpot")
public JSONObject SelectSpot(@RequestBody SelectSpot spot) {
	
 	  JSONObject result = new JSONObject();
  	 
  	 //调用sevice
 	  int i = selectSpotService.selectji(spot);
 	  result.put("massage", i);
  	
  	return result;
  	}
}
