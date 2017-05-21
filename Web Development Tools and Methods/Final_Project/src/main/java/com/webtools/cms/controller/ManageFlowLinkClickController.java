package com.webtools.cms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webtools.cms.DAO.ApplicationDAO;
import com.webtools.cms.pojo.Application;


@Controller
@RequestMapping("/admin/ManageFlow.htm")
public class ManageFlowLinkClickController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm(@ModelAttribute("application") Application application, BindingResult result) {
		try{
			ApplicationDAO applicationDAO = new ApplicationDAO();
			List<Application> applicationList = applicationDAO.getApplication();
			ModelAndView mv = new ModelAndView("manageApplicationFlow", "applicationList", applicationList);
		     return mv;
			}
			catch(Exception e){
				ModelAndView mv = new ModelAndView("error", "userName", null);
			     return mv;
			}
	}
}
