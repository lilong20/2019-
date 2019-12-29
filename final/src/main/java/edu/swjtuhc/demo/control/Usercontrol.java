package edu.swjtuhc.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.sysuser;
import edu.swjtuhc.demo.servive.UserService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class Usercontrol {
	@Autowired 
	UserService userservice;
	@RequestMapping("/regist")
	 
	public JSONObject register(@RequestBody sysuser user) {
		JSONObject result =new JSONObject();
	int i=	userservice.register(user);
		result.put("state", 1);
		
		return result;
	}
}
