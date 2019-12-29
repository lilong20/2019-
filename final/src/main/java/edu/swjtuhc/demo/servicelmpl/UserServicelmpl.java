package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.usermapper;
import edu.swjtuhc.demo.model.sysuser;
import edu.swjtuhc.demo.servive.UserService;

@Service
public class UserServicelmpl implements UserService {
	@Autowired
	usermapper usermapper;
	@Override
	public int register(sysuser user) {
		// TODO Auto-generated method stub
		sysuser u0=usermapper.selectSysuserbyusername(user.getUsername());
		int i=-1;
		if(u0==null) {
			i=usermapper.insertuser(user);
			
		}else {
			i=2;
		}
		return i;
	}
		
}
