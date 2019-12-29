package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.mode.Good;
import edu.swjtuhc.demo.service.Goodservice;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/goods")
public class GoodController {
	@Autowired
	Goodservice goodservice;
	@RequestMapping("/select")
	public JSONObject select(@RequestBody Good good) {
		JSONObject result=new JSONObject();
		
		int i =goodservice.register(good);
		if (i==2) {
			System.out.println("该用户存在！");
		}
		result.put("state", i);
		return result;
	}
}
