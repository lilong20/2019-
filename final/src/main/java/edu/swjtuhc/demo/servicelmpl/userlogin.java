package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.swjtuhc.demo.mapper.usermapper;
import edu.swjtuhc.demo.model.sysuser;


public class userlogin implements edu.swjtuhc.demo.servive.userlogin{

	@Autowired
	usermapper usermapper;
	
	@Override
	
	public int login(sysuser user) {
		// TODO Auto-generated method stub
		sysuser a=usermapper.finduserfromnamepasswrd("username"," password");
		int i=0;
		if(a!=null) {
			System.out.println("登陆成功");
			
		}else {
			i=2;
					}
		
		return i;

}
}
