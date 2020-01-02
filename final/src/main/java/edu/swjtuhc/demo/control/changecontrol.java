package edu.swjtuhc.demo.control;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.sysuser;
import edu.swjtuhc.demo.servive.changerservice;
import net.sf.json.JSONObject;

@RestController 
@RequestMapping("/user")
public class changecontrol {
	@Autowired
	changerservice changepwd;
    @RequestMapping("/change")

public JSONObject change(@RequestBody sysuser user,Integer p) {
    	JSONObject o=new JSONObject();
    	int i=changepwd.changepwd(user, user.getPassword());
    	o.put("state", i);
    	
    	return o;
    }

}
