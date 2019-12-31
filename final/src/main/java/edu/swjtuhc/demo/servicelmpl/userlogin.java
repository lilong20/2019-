package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.loginmapper;
import edu.swjtuhc.demo.mapper.usermapper;
import edu.swjtuhc.demo.model.sysuser;

@Service
public class userlogin implements edu.swjtuhc.demo.servive.userlogin{

	@Autowired
	loginmapper login;
	@Override
	
	public int login(sysuser user) {
		// TODO Auto-generated method stub
		sysuser a=login.finduserfromnamepasswrd(user.getUsername(),user. getPassword());
		int i=0;
	if(a!=null) {
		i=1;
	}else {
		i=2;
	}
		return i;

}
}
