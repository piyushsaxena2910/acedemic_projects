package com.jsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.redis.MedicalRepoImplementation;
import com.redis.RedisConfiguration;

public class ParsingJson {
	
	JSONParser parser = new JSONParser();
	ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(RedisConfiguration.class);
	
	public void fetchData(){
		
		StringRedisTemplate redisTemplate = (StringRedisTemplate)context.getBean("strRedisTemplate");
		HashOperations<String, String, String> hash = redisTemplate.opsForHash();
		String planName,serviceName,serviceID;
		MedicalRepoImplementation medicalRepoImplementation = new MedicalRepoImplementation();
		
		try {
			Object obj = parser.parse(new FileReader("D:\\MIS\\Advances in Big Data Design and Engineering\\test.json"));
			JSONObject jsonObject = (JSONObject) obj;
			
			
			planName = (String) jsonObject.get("Plan ID");
			System.out.println("Plan Name :"+ planName);
			
//			JSONArray service = (JSONArray) jsonObject.get("Services");
//			Iterator<JSONObject> iterator  = service.iterator();
//			while(iterator.hasNext()){
//				JSONObject serviceObj = (JSONObject) iterator.next();
//				serviceName= (String)serviceObj.get("Service Name");
//				System.out.println("Service Name" + serviceName);
//				serviceID = (String)serviceObj.get("Service ID");
//				System.out.println("Service ID" + serviceID);
//			}
			
//			Map<String,String> serviceMap = new HashMap<>();
//			serviceMap.put("Service ID", serviceID);
//			serviceMap.put("Service Name", serviceName);
			
			MedicalRepoImplementation impl = new MedicalRepoImplementation();
			
			
			Map<String,String> planMap = new HashMap<>();
			planMap.put("Plan1", jsonObject.toJSONString());
			
			hash.putAll(planName, planMap);
			
			impl.find(planName,jsonObject);
			planName = (String) jsonObject.get("Plan ID");
			System.out.println("Plan Name :"+ planName);
		} 
		catch (Exception e) {
			
			System.out.println("Exception : "+ e);
		}
	}

}
