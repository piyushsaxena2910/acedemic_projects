package com.webtools.cms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
@RequestMapping("/admin/addAPageLink.htm")
public class AddAPageLinkClickController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm(@ModelAttribute("page") Page page, BindingResult result, HttpServletRequest request) throws AdException {
		try{
		ApplicationDAO applicationDAO = new ApplicationDAO();
		List<Application> applicationList = applicationDAO.getApplication();
		HttpSession session = request.getSession();
		session.setAttribute("applicationList", applicationList);
		ModelAndView mv = new ModelAndView("addAPage", "applicationList", applicationList);
	     return mv;
		}
		catch(Exception e){
			ModelAndView mv = new ModelAndView("error", "userName", null);
		     return mv;
		}
	}
}
