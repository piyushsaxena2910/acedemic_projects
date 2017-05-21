package com.webtools.cms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.webtools.cms.DAO.CategoryDAO;
import com.webtools.cms.DAO.PageDAO;
import com.webtools.cms.DAO.ProductsDAO;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Category;
import com.webtools.cms.pojo.Page;
import com.webtools.cms.pojo.Product;

@Controller
@RequestMapping("/admin/editProductCatalogPage.htm")
public class EditProductCatalogController {

private static final Logger logger = LoggerFactory.getLogger(AddAPageController.class);
	
	@Autowired
	@Qualifier("categoryValidator")
	CategoryValidator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doSubmitAction(@ModelAttribute("category") Category category, BindingResult result,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		validator.validate(category, result);
		if (result.hasErrors()) {
			String productName = request.getParameter("productsSelect");
			System.out.println("productName is -> "+productName);
			ProductsDAO productDao = new ProductsDAO();
			Product product = productDao.getProductByName(productName);
			CategoryDAO categoryDAO = new CategoryDAO();
			int numberOfCategories = Integer.parseInt(request.getParameter("numberOfCategoriesHidden"));
			for(int i = 0; i < numberOfCategories; i ++){
				String categoryName = request.getParameter("categoryName"+i);
				String categoryValue = request.getParameter("categoryValue"+i);
				categoryDAO.create(categoryName, categoryValue, product);
			}
			ApplicationDAO applicationDAO = new ApplicationDAO();
			List<Application> applicationList = applicationDAO.getApplication();
			System.out.println("Size of list is: "+applicationList.size());
			ModelAndView mv = new ModelAndView("editProductCatalog", "applicationList", applicationList);
		     return mv;
		}
		
		String productName = request.getParameter("productsSelect");
		ProductsDAO productDao = new ProductsDAO();
		Product product = productDao.getProductByName(productName);
		CategoryDAO categoryDAO = new CategoryDAO();
		int numberOfCategories = Integer.parseInt(request.getParameter("numberOfCategoriesHidden"));
		for(int i = 0; i < numberOfCategories; i ++){
			String categoryName = request.getParameter("categoryName"+i);
			String categoryValue = request.getParameter("categoryValue"+i);
			categoryDAO.create(categoryName, categoryValue, product);
		}
		ApplicationDAO applicationDAO = new ApplicationDAO();
		List<Application> applicationList = applicationDAO.getApplication();
		System.out.println("Size of list is: "+applicationList.size());
		ModelAndView mv = new ModelAndView("editProductCatalog", "applicationList", applicationList);
	     return mv;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm(@ModelAttribute("category") Category category, BindingResult result) {
		validator.validate(category, result);
		if (result.hasErrors()) {
			ModelAndView mv = new ModelAndView("editProductCatalog");
		     return mv;
		}
		
		ModelAndView mv = new ModelAndView("editProductCatalog");
	     return mv;
	}
}
