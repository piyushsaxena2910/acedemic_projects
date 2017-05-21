package com.webtools.cms.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.webtools.cms.pojo.User;


public class UserValidator implements Validator{

	
	public boolean supports(Class aClass) {
		return aClass.equals(User.class);
	}

	
	public void validate(Object obj, Errors errors) {
		User user = (User) obj;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "error.invalid.userName", "User Name Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
        
	}

}
