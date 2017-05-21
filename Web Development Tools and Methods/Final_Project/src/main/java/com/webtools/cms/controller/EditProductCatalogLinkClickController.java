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
import com.webtools.cms.pojo.Category;
import com.webtools.cms.pojo.Page;
import com.webtools.cms.pojo.Product;

@Controller
@RequestMapping("/admin/EditProductCatalogPage.htm")
public class EditProductCatalogLinkClickController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm(@ModelAttribute("category") Category category, BindingResult result) {
		try{
			ApplicationDAO applicationDAO = new ApplicationDAO();
			List<Application> applicationList = applicationDAO.getApplication();
			System.out.println("Size of list is: "+applicationList.size());
			ModelAndView mv = new ModelAndView("editProductCatalog", "applicationList", applicationList);
		     return mv;
			}
			catch(Exception e){
				ModelAndView mv = new ModelAndView("error", "userName", null);
			     return mv;
			}
	}
}
