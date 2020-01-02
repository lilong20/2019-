package edu.swjtuhc.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.changermapper;
import edu.swjtuhc.demo.model.sysuser;
import edu.swjtuhc.demo.servive.changerservice;
@Service 
public class changepassword implements changerservice{
@Autowired
changermapper changepwd;
	@Override
	public int changepwd(sysuser user, int np) {
		// TODO Auto-generated method stub
		sysuser s0=changepwd.selctbynamepswSysuserageSysuser(user.getUsername(),user.getPassword(),user.getAge());
		int i=-1;
		if(s0!=null) {
		i=changepwd.updatepwd(user,np );			
		}else {
			i=2;
		}
		return i;
	}

}
