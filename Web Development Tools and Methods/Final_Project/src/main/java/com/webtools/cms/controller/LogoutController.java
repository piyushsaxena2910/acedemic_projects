package com.webtools.cms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webtools.cms.DAO.ApplicationDAO;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Category;
import com.webtools.cms.pojo.User;

@Controller
@RequestMapping("/logout.htm")
public class LogoutController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm(@ModelAttribute("user") User user, BindingResult result, HttpServletRequest request, HttpServletResponse response) {
		try{
			HttpSession session = request.getSession();
			session.removeAttribute(("loggedInTester"));
			session.invalidate();
			ModelAndView mv = new ModelAndView("index");
		     return mv;
			}
			catch(Exception e){
				ModelAndView mv = new ModelAndView("error", "userName", null);
			     return mv;
			}
	}
}
