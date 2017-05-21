package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.jsonReader.ParsingJson;
import com.jsonReader.PlanJsonReader;
import com.redis.MedicalRepo;

@SpringBootApplication
@ComponentScan(basePackageClasses=ResourceController.class)
public class MedicalCoverageRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalCoverageRestApiApplication.class, args);
		
		PlanJsonReader plan = new PlanJsonReader();
		plan.read();
		
		ParsingJson parse = new ParsingJson();
		parse.fetchData();
	}
}
