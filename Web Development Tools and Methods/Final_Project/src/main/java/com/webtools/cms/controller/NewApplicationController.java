package com.webtools.cms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webtools.cms.DAO.ApplicationDAO;
import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Page;

@Controller
@RequestMapping("/admin/addApplication.htm")
public class NewApplicationController {
	
private static final Logger logger = LoggerFactory.getLogger(NewApplicationController.class);


	@Autowired
	@Qualifier("applicationValidator")
	ApplicationValidator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);

		System.out.println("In validator");
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doSubmitAction1(@ModelAttribute("application") Application application, BindingResult result) throws Exception {

		
		validator.validate(application, result);
		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("addAnApplication");
		     return mv;
		}
		ApplicationDAO applicationDAO = new ApplicationDAO();
		applicationDAO.createApplication(application.getApplicationName());
		ModelAndView mv = new ModelAndView("home", "userName", null);
	     return mv;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm1(@ModelAttribute("application") Application application, BindingResult result) throws AdException {
		validator.validate(application, result);
		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("error");
		     return mv;
		}
		ApplicationDAO applicationDAO = new ApplicationDAO();
		applicationDAO.createApplication(application.getApplicationName());
		ModelAndView mv = new ModelAndView("home", "userName", null);
	     return mv;
	}
}
