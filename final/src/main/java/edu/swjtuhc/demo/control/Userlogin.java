package edu.swjtuhc.demo.control;

import java.lang.Thread.State;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.sysuser;
import edu.swjtuhc.demo.servive.userlogin;
import net.sf.json.JSONObject;

@RequestMapping("/user")
public class Userlogin {
	@Autowired 
	userlogin userlogin;
	@RequestMapping("/login")
public JSONObject login (@RequestBody sysuser user) {

  JSONObject result	 =new JSONObject();
  int i=userlogin.login(user);
  result.put("state", 1);
  
  return result;
  
}

}
