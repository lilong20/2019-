package edu.swjtuhc.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.sysuser;
import edu.swjtuhc.demo.servive.userlogin;
import net.sf.json.JSONObject;
@RestController
@RequestMapping("/user")
public class logincontrol {
	
	@Autowired 
	userlogin login;
	@RequestMapping("/login")
	public JSONObject login(@RequestBody sysuser user) {
		JSONObject a=new JSONObject();
		int i=login.login(user);
		a.put("sda", i);
		return a;
		}
}
