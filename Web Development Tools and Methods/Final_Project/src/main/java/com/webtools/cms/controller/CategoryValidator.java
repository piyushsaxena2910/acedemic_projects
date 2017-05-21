package com.webtools.cms.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.webtools.cms.pojo.Category;

public class CategoryValidator implements Validator{

	public boolean supports(Class aClass) {
		return aClass.equals(Category.class);
	}

	
	public void validate(Object obj, Errors errors) {
		Category category = (Category) obj;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "categoryName", "error.invalid.categoryName", "Category Name is Required");
        }
}
