package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.executor.keygen.Jdbc3KeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.dairy;
import com.example.demo.service.dairyservice;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/dairy")
public class dairycontroller {
	@Autowired
	dairyservice dairyservice;
	@RequestMapping("/getlist")
	public List<dairy> getlist(){
		
		return dairyservice.getdairyList();
	}
	
	
	@RequestMapping("/creatdairy")
	public JSONObject creatdairy(dairy dairy,MultipartFile file) {
		JSONObject result = new JSONObject();
		System.out.println(dairy);
		System.out.println(file.getOriginalFilename());
		dairy.setPhoto(file.getOriginalFilename());
		try {
			dairyservice.creatdairy(dairy,file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.put("state", "上传成功");
		return result;
	}
}
