package com.webtools.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webtools.cms.DAO.UserDAO;
import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.User;

@Controller
@RequestMapping("/index.htm")
public class WelcomeControllerTester {

	@RequestMapping(method = RequestMethod.GET)
	public String initializeForm(@ModelAttribute("user") User user, BindingResult result) throws AdException {
			return "index";
		}
	}