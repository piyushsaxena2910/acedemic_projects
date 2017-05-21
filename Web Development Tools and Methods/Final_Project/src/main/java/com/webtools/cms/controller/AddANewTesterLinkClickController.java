package com.webtools.cms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webtools.cms.DAO.ApplicationDAO;
import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Page;
import com.webtools.cms.pojo.User;

@Controller
@RequestMapping("/admin/AddAUser.htm")
public class AddANewTesterLinkClickController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm(@ModelAttribute("user") User user, BindingResult result) throws AdException {
		try{
		ModelAndView mv = new ModelAndView("addATester");
	     return mv;
		}
		catch(Exception e){
			ModelAndView mv = new ModelAndView("error", "userName", null);
		     return mv;
		}
	}
}
