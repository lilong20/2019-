package edu.swjtuhc.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.goods;
import edu.swjtuhc.demo.servive.bugoodsservice;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/goods")
public class buygoodscontrol {
	
	@Autowired
	bugoodsservice buy;

@RequestMapping("/buy")
public JSONObject buygoods(@RequestBody goods goods, Integer p) {
	JSONObject a=new JSONObject();
	int i=buy.buygoods(goods,p);
	a.put("a", i);
	return a;
}
}
