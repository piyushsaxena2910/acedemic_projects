package com.redis;

import java.io.FileReader;
import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.pojo.Plans;

public class MedicalRepoImplementation implements MedicalRepo {

	Object obj = parser.parse(new FileReader("D:\\MIS\\Advances in Big Data Design and Engineering\\test.json"));
	JSONObject jsonObject = (JSONObject) obj;
	private RedisTemplate<String, Plans> redisTemplate;
	private static String MEDICAL_KEY = "Medical";
	
	public RedisTemplate<String,Plans> getRedisTemplate(){
		return redisTemplate;
	}
	
	public void setRedisTemplate(RedisTemplate<String,Plans> redisTemplate){
		this.redisTemplate = redisTemplate;
	}
	
	@Override
	public void save(Plans plan) {
		
		this.redisTemplate.opsForHash().put(MEDICAL_KEY, plan.getPlanId(), plan);
		
	}

	@Override
	public Plans find(String id,JSONObject jsonObject) {
		
		hash.values(id).forEach(value ->{
			System.out.println(value.toString());
		});
		
		
		return (Plans)this.redisTemplate.opsForHash().get(MEDICAL_KEY, id);
	}

	@Override
	public Map<Object, Object> findAll() {
		
		return this.redisTemplate.opsForHash().entries(MEDICAL_KEY);
	}

	@Override
	public void delete(String id) {
		
		this.redisTemplate.opsForHash().delete(MEDICAL_KEY, id);
		
	}

}
