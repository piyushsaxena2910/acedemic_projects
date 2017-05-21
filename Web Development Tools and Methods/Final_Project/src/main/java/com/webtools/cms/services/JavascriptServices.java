package com.webtools.cms.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.webtools.cms.DAO.ApplicationDAO;
import com.webtools.cms.DAO.PageDAO;
import com.webtools.cms.DAO.ProductsDAO;
import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Page;
import com.webtools.cms.pojo.Product;

public class JavascriptServices {
	
	public String[] getPageList(String applicationName) throws AdException{
		System.out.println("inside getPage with data" + applicationName);
		ApplicationDAO applicationDAO = new ApplicationDAO();
		Application app = applicationDAO.getApplication(applicationName);
		PageDAO pageDAO = new PageDAO();
		List<Page> pages = pageDAO.getPages(app.getApplicationID());
		String[] pageNames = new String[pages.size()];
		Iterator<Page> it = pages.iterator();
	     for(int i = 0; i < pages.size(); i++){
	        pageNames[i] = it.next().getPageName();
	     }
	     System.out.println("Displaying size -> "+pageNames.length);
	     System.out.println("Displaying page -> "+pageNames[0]);
		return pageNames;
	}
	
	public String[] getProductsList(String applicationName) throws AdException{
		System.out.println("inside getProducts with data" + applicationName);
		ApplicationDAO applicationDAO = new ApplicationDAO();
		Application app = applicationDAO.getApplication(applicationName);
		System.out.println("application is -> "+app);
		int productCatalogID = app.getProductCatalog().getProductCatalogID();
		System.out.println("productcatalogID -> "+productCatalogID);
		ProductsDAO productsDAO = new ProductsDAO();
		List<Product> products = productsDAO.getProducts(String.valueOf(productCatalogID));
		String[] productsArray = new String[products.size()];
		for(int i = 0; i < products.size(); i++){
			productsArray[i] = products.get(i).getProductName();
		}
	    System.out.println("Displaying size -> "+products.size());
		return productsArray;
	}
	
	public String getProductCatalog(String applicationName) throws AdException{
		System.out.println("inside getProducts with data" + applicationName);
		ApplicationDAO applicationDAO = new ApplicationDAO();
		Application app = applicationDAO.getApplication(applicationName);
		String productCatalogID = String.valueOf(app.getProductCatalog().getProductCatalogID());
	    System.out.println("Displaying productCatalogID -> "+productCatalogID);
		return productCatalogID;
	}
	
	public String[] getPageDetails(String pageName) throws AdException{
		PageDAO pageDAO = new PageDAO();
		Page page = pageDAO.getPage(pageName);
		String[] pageDetails = new String[6];
		pageDetails[0] = page.getArticle().getArticle();
		pageDetails[1] = page.getAside().getAside();
		pageDetails[2] = page.getFooter().getFooter();
		pageDetails[3] = page.getHeader().getHeader();
		pageDetails[4] = page.getNavigator().getNavigator();
		pageDetails[5] = page.getSection().getSection();
		return pageDetails;
	}
}
