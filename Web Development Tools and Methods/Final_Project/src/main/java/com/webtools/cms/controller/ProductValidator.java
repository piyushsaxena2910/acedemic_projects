package com.webtools.cms.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.webtools.cms.pojo.Product;

public class ProductValidator implements Validator{

	public boolean supports(Class aClass) {
		return aClass.equals(Product.class);
	}

	
	public void validate(Object obj, Errors errors) {
		Product product = (Product) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "productName", "error.invalid.productName", "Product Name is Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "productPrice", "error.invalid.productPrice", "Product Price is Required");
        }
}
