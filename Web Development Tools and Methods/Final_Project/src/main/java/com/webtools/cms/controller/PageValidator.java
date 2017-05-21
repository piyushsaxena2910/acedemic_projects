package com.webtools.cms.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.webtools.cms.pojo.Page;


public class PageValidator implements Validator{

	public boolean supports(Class aClass) {
		return aClass.equals(Page.class);
	}

	
	public void validate(Object obj, Errors errors) {
		Page page = (Page) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pageName", "error.invalid.pageName", "Page Name is Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "header", "error.invalid.header", "Header is Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "article", "error.invalid.article", "Article is Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "aside", "error.invalid.aside", "Aside is Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "navigator", "error.invalid.navigator", "Navigator is Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "section", "error.invalid.section", "Section is Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "footer", "error.invalid.footer", "Section is Required");
	}
}
