package com.example.demo.servicipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.commentmapper;
import com.example.demo.model.comment;
import com.example.demo.service.commentservice;

@Service
public class commentseriveimpl implements commentservice {
	@Autowired
	commentmapper commentmapper;
	public int register(comment comment) {
		int i = commentmapper.insertcomment(comment);
		return i;
		
	}

}
