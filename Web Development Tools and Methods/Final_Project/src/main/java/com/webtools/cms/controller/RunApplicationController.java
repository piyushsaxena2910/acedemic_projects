package com.webtools.cms.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
import com.webtools.cms.DAO.CategoryDAO;
import com.webtools.cms.DAO.PageDAO;
import com.webtools.cms.DAO.ProductsDAO;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Category;
import com.webtools.cms.pojo.Page;
import com.webtools.cms.pojo.Product;
import com.webtools.cms.pojo.ProductCatalog;
import com.webtools.cms.pojo.User;

@Controller
@RequestMapping("runApplication.htm")
public class RunApplicationController {

	@RequestMapping(method = RequestMethod.POST)
	protected ModelAndView doSubmitAction(@ModelAttribute("user") User user, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("loggedInTester")==null){
			ModelAndView mv = new ModelAndView("index");
			return mv;
		}
		else{
		if(request.getParameter("application")!=null){
		String applicationName = request.getParameter("application");
		ApplicationDAO applicationDAO = new ApplicationDAO();
		Application application = applicationDAO.getApplication(applicationName);
		
		PageDAO pageDAO = new PageDAO();
		List<Page> pages = pageDAO.getPages(application.getApplicationID());
		
		String flow = application.getFlow();
		HashMap<String,Page> mapOfPages = new HashMap<String,Page>();
		if(flow.charAt(0)==' '){
			flow = flow.substring(1, flow.length());
		}
		String[] flowNumber = flow.split(" ");
		String pageSequenceNumberAssignedToProductCatalogPage = flowNumber[flowNumber.length-1];
		for(int i = 0; i < pages.size(); i++){
			mapOfPages.put(flowNumber[i], pages.get(i));
		}
		Page productCatalogPage = new Page();
		mapOfPages.put(pageSequenceNumberAssignedToProductCatalogPage, productCatalogPage);
		Map<String, Page> treeOfPages = new TreeMap<String, Page>(mapOfPages);
		Arrays.sort(flowNumber);
		
		session.setAttribute("treeOfPages", treeOfPages);
		session.setAttribute("flowNumber", flowNumber);
		if(pageSequenceNumberAssignedToProductCatalogPage.equals("1")){
			ProductCatalog pc = application.getProductCatalog();
			ProductsDAO productDAO = new ProductsDAO();
			List<Product> products = productDAO.getProducts(String.valueOf(pc.getProductCatalogID()));
			session.setAttribute("products", products);
			
			List<Category> categories = new ArrayList<Category>();
			for(int i = 0; i < products.size(); i++){
				CategoryDAO categoryDAO = new CategoryDAO();
				List<Category> categoryList = categoryDAO.getCategory(products.get(i));
				for(int j = 0; j < categoryList.size(); j++){
					categories.add(categoryList.get(j));
				}
			}
			Set<Category> categoriesSet = new HashSet<Category>(categories);
			session.setAttribute("categories", categoriesSet);
			ModelAndView mv = new ModelAndView("productCatalog", "page", treeOfPages.get(flowNumber[0]));
			return mv;
		}
		else{
		ModelAndView mv = new ModelAndView("contentManagedPage", "page", treeOfPages.get(flowNumber[0]));
		return mv;
		}
	}
		else if(request.getParameter("application")==null){
			if(request.getParameter("productSelected")!=null){
				System.out.println("Product selected -> "+request.getParameter("productSelected"));
				String productName = request.getParameter("productSelected");
				ProductsDAO productDAO = new ProductsDAO();
				Product product = productDAO.getProductByName(productName);
				session.setAttribute("product", product);
			}
			TreeMap<String,Page> treeOfPages = (TreeMap<String, Page>) session.getAttribute("treeOfPages");
			session.removeAttribute("treeOfPages");
			String[] flowNumber = (String[]) session.getAttribute("flowNumber");
			session.removeAttribute("flowNumber");
			treeOfPages.remove(flowNumber[0]);
			flowNumber = Arrays.copyOfRange(flowNumber, 1, flowNumber.length);
			if(treeOfPages.size()!=0){
			session.setAttribute("treeOfPages", treeOfPages);
			session.setAttribute("flowNumber", flowNumber);
			ModelAndView mv = new ModelAndView("contentManagedPage", "page", treeOfPages.get(flowNumber[0]));
			return mv;
			}
			else{
				session.removeAttribute("treeOfPages");
				session.removeAttribute("flowNumber");
				session.removeAttribute("product");
				ApplicationDAO applicationDAO = new ApplicationDAO();
				List<Application> applicationList = applicationDAO.getApplication();
				ModelAndView mv = new ModelAndView("testerHome", "applicationList", applicationList);
			    return mv;
			}
		}
		else{
			ModelAndView mv = new ModelAndView("error");
			return mv;
		}
		}
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initializeForm(@ModelAttribute("user") User user, BindingResult result) {

		return "contentManagedPage";
	}
}
