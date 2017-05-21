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
import com.webtools.cms.pojo.Product;
import com.webtools.cms.pojo.User;

@Controller
@RequestMapping("/admin/AddOrViewProducts.htm")
public class AddOrViewPageLinkClickController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm(@ModelAttribute("product") Product product, BindingResult result) throws AdException {
		try{
			ApplicationDAO applicationDAO = new ApplicationDAO();
			List<Application> applicationList = applicationDAO.getApplication();
			ModelAndView mv = new ModelAndView("addOrViewProducts", "applicationList", applicationList);
			return mv;
		}
		catch(Exception e){
			ModelAndView mv = new ModelAndView("error", "userName", null);
		     return mv;
		}
	}
}
