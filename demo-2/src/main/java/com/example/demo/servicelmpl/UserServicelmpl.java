package com.example.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.SysUser;
import com.example.demo.service.UserService;

@Service
public class UserServicelmpl implements UserService{
    @Autowired
    UserMapper  usermapper; 
	
	
	@Override
	public int register(SysUser user) {
		// TODO Auto-generated method stub
		SysUser u0 = usermapper.selectUserByUsername(user.getUserneme());
		int i =-1;
		if (u0==null) {
			i = usermapper.insertUser(user);
		}else {
			i=2;
		}
		
		return i;
	}

}
