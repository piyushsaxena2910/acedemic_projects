package com.example;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.MedicalService;

@RestController
public class ResourceController {
	
	MedicalService service = new MedicalService();
	
	
	@RequestMapping(value = "/medicalPlan", method = RequestMethod.GET,produces =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JSONObject> getPlanID(){
		
		JSONObject value=service.getPlan();
		return new ResponseEntity<JSONObject> (value,HttpStatus.OK);
	}
}
