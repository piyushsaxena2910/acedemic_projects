package com.webtools.cms.controller;

import javax.mail.internet.MimeMessage;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webtools.cms.DAO.UserDAO;
import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.User;

@Controller
@RequestMapping("/admin/addATesterRole.htm")
public class AddATesterController {

private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	@Qualifier("userValidator")
	UserValidator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	protected ModelAndView doSubmitAction(@ModelAttribute("user") User user, BindingResult result) throws Exception {
		validator.validate(user, result);
		User userFound = null;
		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("addATester");
		     return mv;
		}

		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.googlemail.com");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("piyushsaxena2910@gmail.com", "Faridkot!1"));
			email.setSSL(true);
			email.setFrom("piyushsaxena2910@gmail.com");
			email.setSubject("Your Login Credentials");
			email.setMsg("Your Login Credentials are - Username : " + user.getUserName() + " and Password : " + user.getPassword());
			email.addTo("piyushsaxena2910@gmail.com");
			email.send();
			UserDAO userDao = new UserDAO();
			userDao.createUser(user.getUserName(), user.getPassword(), user.getRole());
			ModelAndView mv = new ModelAndView("home");
			return mv;
		} catch (AdException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		ModelAndView mv = new ModelAndView("error", "userFound", userFound);
	     return mv;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initializeForm(@ModelAttribute("user") User user, BindingResult result) {

		return "error";
	}
}
