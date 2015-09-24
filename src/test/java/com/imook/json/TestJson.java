package com.imook.json;


import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

import com.imook.pojo.TUser;

public class TestJson {
	private Logger logger;
	@Test
	public void doJson(){
		
		TUser user=new TUser("xiaoming","xiaoming");
		JSONObject json=JSONObject.fromObject(user);
		System.out.println(json.toString());
	}
	@Test
	public void testLog(){
		PropertyConfigurator.configure("src/test/java/com/imook/json/log4j.properties");
		logger=Logger.getLogger(TestJson.class);
		logger.debug("This is a DEBUG message!");
		logger.info("This is a INFO message");
		
	}

}
