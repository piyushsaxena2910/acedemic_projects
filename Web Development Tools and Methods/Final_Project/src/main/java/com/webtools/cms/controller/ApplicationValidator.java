package com.webtools.cms.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.webtools.cms.pojo.Application;

public class ApplicationValidator implements Validator{
	public boolean supports(Class aClass) {
		return aClass.equals(Application.class);
	}

	
	public void validate(Object obj, Errors errors) {
		Application application = (Application) obj;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "applicationName", "error.invalid.applicationName", "Application Name is Required");
	}
}
