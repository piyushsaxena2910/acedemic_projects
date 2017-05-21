package com.webtools.cms.RESTfulServices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webtools.cms.DAO.ApplicationDAO;
import com.webtools.cms.DAO.ProductCatalogDAO;
import com.webtools.cms.DAO.ProductsDAO;
import com.webtools.cms.controller.AddAPageController;
import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Product;
import com.webtools.cms.pojo.ProductCatalog;

@Controller
public class RestController {

	private static final Logger logger = LoggerFactory.getLogger(AddAPageController.class);
	ProductsDAO productsDAO = new ProductsDAO();
	public RestController() {
		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public String home(Locale locale, Model model) {
	    logger.info("Welcome home! The client locale is {}.", locale);
	     
	    model.addAttribute("serverTime", null );
	     
	    return "status";
	  }
	
	@RequestMapping(value="/admin/addProduct", method=RequestMethod.POST)
	  @ResponseBody
	  public Product addProduct(@ModelAttribute("product") Product product, HttpServletRequest request, HttpServletResponse response) throws NumberFormatException, AdException {
	     
	    if (product != null) {
	      logger.info("Inside addIssuer, adding: " + product.toString());
	    } else {
	      logger.info("Inside addIssuer...");
	    }
	    ApplicationDAO applicationDAO = new ApplicationDAO();
	    int productCatalogIDFound = applicationDAO.getApplication(request.getParameter("application")).getApplicationID();
	    ProductCatalogDAO productCatalogDAO = new ProductCatalogDAO();
	    ProductCatalog productCatalog = productCatalogDAO.getProductCatalog(productCatalogIDFound);
	    productsDAO.create(productCatalog, product.getProductName(), product.getProductPrice());
	    return product; 
	  }
	
	@RequestMapping(value="/admin/products", method=RequestMethod.POST)
	  @ResponseBody
	  public Product getAllProducts( HttpServletRequest request, HttpServletResponse response) throws NumberFormatException, AdException {
		/*if (product != null) {
		      logger.info("Inside addIssuer, adding: " + product.toString());
		    } else {
		      logger.info("Inside addIssuer...");
		    }*/
		List<Product> productList = new ArrayList<Product>();
	    ApplicationDAO applicationDAO = new ApplicationDAO();
	    int productCatalogIDFound = applicationDAO.getApplication(request.getParameter("application")).getApplicationID();
	    System.out.println("productCatalogIDFound -> "+productCatalogIDFound);
	    ProductCatalogDAO productCatalogDAO = new ProductCatalogDAO();
	    ProductCatalog productCatalog = productCatalogDAO.getProductCatalog(productCatalogIDFound);
	    System.out.println("productCatalog -> "+productCatalog);
	    productList = productsDAO.getProducts(String.valueOf(productCatalogIDFound));
	    Map<Integer, Product> products = new HashMap<Integer, Product>();
	    for(Product prd : productList){
	    	products.put(prd.getProductID(), prd);
	    }
	    System.out.println("Product map -> "+products);
	    return products.get("Product1");
	  }
	@RequestMapping(value="/admin/products", method=RequestMethod.GET)
	  @ResponseBody
	  public Map<String, Product> getAllProductsGet(@ModelAttribute("product") Product product, HttpServletRequest request, HttpServletResponse response) throws NumberFormatException, AdException {
		if (product != null) {
		      logger.info("Inside addIssuer, adding: " + product.toString());
		    } else {
		      logger.info("Inside addIssuer...");
		    }
		List<Product> productList = new ArrayList<Product>();
	    ApplicationDAO applicationDAO = new ApplicationDAO();
	    int productCatalogIDFound = applicationDAO.getApplication(request.getParameter("application")).getApplicationID();
	    System.out.println("productCatalogIDFound -> "+productCatalogIDFound);
	    ProductCatalogDAO productCatalogDAO = new ProductCatalogDAO();
	    ProductCatalog productCatalog = productCatalogDAO.getProductCatalog(productCatalogIDFound);
	    System.out.println("productCatalog -> "+productCatalog);
	    productList = productsDAO.getProducts(String.valueOf(productCatalogIDFound));
	    Map<String, Product> products = new HashMap<String, Product>();
	    for(Product prd : productList){
	    	products.put(prd.getProductName(), prd);
	    }
	    System.out.println("Product map -> "+products);
	    return products;
	  }
	  
}
