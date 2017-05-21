package com.jsonReader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.pojo.Costs;
import com.pojo.Plans;
import com.pojo.Services;
import com.redis.MedicalRepo;
import com.redis.MedicalRepoImplementation;
import com.redis.RedisConfiguration;

public class PlanJsonReader {
	
	ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(RedisConfiguration.class);

	public void read() {

		StringRedisTemplate redisTemplate = (StringRedisTemplate)context.getBean("strRedisTemplate");
		HashOperations<String, String, String> hash = redisTemplate.opsForHash();
		String plan1 = "Plan 1";
		
		// Services object + JSON Array
		Services service = new Services();
		service.setServiceId("Service 1");
		service.setServiceName("A");

		// Cost object + JSON Array
		Costs cost = new Costs();
		cost.setCostId("cost1");
		cost.setDeductibles(100.0);
		cost.setCopay(50.0);
		
		JSONArray serviceList = new JSONArray();
		JSONObject serviceInfo = new JSONObject();
		serviceInfo.put("Service ID",service.getServiceId());
		serviceInfo.put("Service Name", service.getServiceName());
		serviceList.add(serviceInfo);
		
		JSONArray costList = new JSONArray();
		JSONObject costInfo = new JSONObject();
		costInfo.put("Cost ID", cost.getCostId());
		costInfo.put("Deductibles", cost.getDeductibles());
		costInfo.put("CoPay", cost.getCopay());
		costList.add(costInfo);
		
		JSONObject obj = new JSONObject();
		obj.put("Plan ID","Plan1");
		obj.put("Services", serviceList);
		obj.put("Costs", costList);
		
		try {
			FileWriter file = new FileWriter("D:\\MIS\\Advances in Big Data Design and Engineering\\test.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(obj);	
	}

}
