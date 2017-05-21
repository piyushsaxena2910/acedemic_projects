package com.webtools.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Page;

@Controller
@RequestMapping("admin/newApplicationLink.htm")


public class NewApplicationLinkClickController {
	@RequestMapping(method = RequestMethod.GET)
	public String initializeForm(@ModelAttribute("application") Application application, BindingResult result) {
		return "addAnApplication";
	}


}
