package com.webtools.cms.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webtools.cms.controller.UserValidator;
import com.webtools.cms.DAO.ApplicationDAO;
import com.webtools.cms.DAO.UserDAO;
import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	@Qualifier("userValidator")
	UserValidator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(value="/login.htm", method = RequestMethod.POST)
	protected ModelAndView doSubmitActionForAdmin(@ModelAttribute("user") User user, BindingResult result,HttpServletRequest request, HttpServletResponse response) throws Exception {
		validator.validate(user, result);
		User userFound = null;
		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("index");
		     return mv;
		}

		try {
			
			UserDAO userDao = new UserDAO();
			
			userFound = userDao.get(user.getUserName(),user.getPassword());
			if(userFound!=null&&userFound.getUserName().equals("admin")){
			ModelAndView mv = new ModelAndView("home", "userFound", userFound);
		    return mv;
		    }
			if(userFound!=null && !userFound.getUserName().equals("admin")){
				HttpSession session = request.getSession();
				session.setAttribute("loggedInTester", userFound);
				ApplicationDAO applicationDAO = new ApplicationDAO();
				List<Application> applicationList = applicationDAO.getApplication();
				ModelAndView mv = new ModelAndView("testerHome", "applicationList", applicationList);
			    return mv;
			    }
			else{
				ModelAndView mv = new ModelAndView("index", "userNotFound", "User Not Found. Try valid credentials.");
			    return mv;
			}
		} catch (AdException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		ModelAndView mv = new ModelAndView("error", "userFound", userFound);
	     return mv;
		
	}
	@RequestMapping(method = RequestMethod.GET)
	public String initializeForm(@ModelAttribute("user") User user, BindingResult result) {

		return "index";
	}
	
}
