package edu.swjtuhc.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.order;
import edu.swjtuhc.demo.servive.orders;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class userordercontrol {
@Autowired
orders addorder;
@RequestMapping("/order")
public JSONObject orders(@RequestBody order order) {
	JSONObject a0=new JSONObject();
	int i=addorder.goodsorder(order);
	a0.put("a", i);
	return a0;
	
	
}

}
