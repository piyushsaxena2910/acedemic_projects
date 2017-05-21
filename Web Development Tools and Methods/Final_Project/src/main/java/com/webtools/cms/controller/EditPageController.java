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
import com.webtools.cms.DAO.PageDAO;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Page;

@Controller
@RequestMapping("/admin/editAPage.htm")
public class EditPageController {
private static final Logger logger = LoggerFactory.getLogger(AddAPageController.class);
	
	@Autowired
	@Qualifier("pageValidator")
	PageValidator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doSubmitAction(@ModelAttribute("page") Page page, BindingResult result, HttpServletRequest request) throws Exception {
		validator.validate(page, result);
		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("editAPage");
		     return mv;
		}
		HttpSession session = request.getSession();
		session.removeAttribute("applicationList");
		ApplicationDAO applicationDAO = new ApplicationDAO();
		Application app = applicationDAO.getApplication(String.valueOf(page.getApplication()));
		PageDAO pageDAO = new PageDAO();
		pageDAO.update(app,page.getPageName(),page.getArticle().getArticle(),page.getAside().getAside(),page.getFooter().getFooter(),page.getHeader().getHeader(),page.getNavigator().getNavigator(),page.getSection().getSection());
		ModelAndView mv = new ModelAndView("home", "userName", null);
	     return mv;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm(@ModelAttribute("page") Page page, BindingResult result) {
		validator.validate(page, result);
		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("error", "userName", null);
		     return mv;
		}
		
		ModelAndView mv = new ModelAndView("error");
	     return mv;
	}
}
