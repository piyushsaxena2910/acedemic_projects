package com.webtools.cms.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webtools.cms.DAO.CategoryDAO;
import com.webtools.cms.pojo.Category;


@Controller
@RequestMapping("/admin/editCategoryDisplay.htm")
public class EditCategoryDisplayLinkClickController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initializeForm(HttpServletRequest request, HttpServletResponse response) {
		try{
			CategoryDAO categoryDAO = new CategoryDAO();
			List<Category> categoryList = categoryDAO.getCategory();
			Set<String> categoryNames = new HashSet<String>();
			Set<String> categoryValues = new HashSet<String>();
			for(int i = 0; i < categoryList.size(); i++){
				categoryNames.add(categoryList.get(i).getCategoryName());
				categoryValues.add(categoryList.get(i).getCategoryValue());
			}
			Object[] categoryNameAndValue = new Object[2];
			categoryNameAndValue[0] = categoryNames;
			categoryNameAndValue[1] = categoryValues;
			System.out.println("Names in category set"+categoryNames);
			System.out.println("Values in category set"+categoryValues);
			HttpSession session = request.getSession();
			session.setAttribute("categoryNames", categoryNames);
			session.setAttribute("categoryValues", categoryValues);
			ModelAndView mv = new ModelAndView("editCategoryDisplay", "categoryNameAndValue", categoryNameAndValue);
		     return mv;
			}
			catch(Exception e){
				System.out.println("Exception occured"+e);
				ModelAndView mv = new ModelAndView("error", "userName", null);
			     return mv;
			}
	}
}
