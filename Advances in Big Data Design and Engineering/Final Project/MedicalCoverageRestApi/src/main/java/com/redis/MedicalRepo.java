package com.redis;

import java.util.Map;

import org.json.simple.JSONObject;

import com.pojo.Plans;

public interface MedicalRepo {
	
	public void save(Plans plan);
	
	public Plans find(String id,JSONObject jsonObject);
	
	public Map<Object,Object> findAll();
	
	public void delete(String id);

}
