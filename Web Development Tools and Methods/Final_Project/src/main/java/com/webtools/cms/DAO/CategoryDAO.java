package com.webtools.cms.DAO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Subqueries;

import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Article;
import com.webtools.cms.pojo.Aside;
import com.webtools.cms.pojo.Category;
import com.webtools.cms.pojo.Footer;
import com.webtools.cms.pojo.Header;
import com.webtools.cms.pojo.Navigator;
import com.webtools.cms.pojo.Page;
import com.webtools.cms.pojo.Product;
import com.webtools.cms.pojo.Section;

public class CategoryDAO extends DAO{

	public Category create(String categoryName, String categoryValue, Product product)  throws AdException{
		try {
            begin();
            System.out.println("inside DAO");
            
            Category category = new Category();
            System.out.print("Testing print application"+product.getProductName());
            //page.setApplication(application);
            category.setProduct(product);
            category.setCategoryName(categoryName);
            category.setCategoryValue(categoryValue);
            
            product.getCategory().add(category);
            getSession().save(category);
            
            commit();
            return category;
            
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while creating Page: " + e.getMessage());
        }
		
	}
	
	public List<Category> getCategory()
            throws AdException {
        try {
            begin();
            Query q = getSession().createQuery("from Category");
            List<Category> categories = (List<Category>) q.list();
            commit();
            return categories;
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get categories ", e);
        }
    }

	public void updateCategoryLogo(String categoryLogoName, String categoryName) 
			throws AdException {
		try {
            begin();
            System.out.println("Inside DAO with values"+" "+categoryLogoName+" "+categoryName);
            Query q = getSession().createQuery("update Category set categoryLogo = :categoryLogo where categoryName = :categoryName");
            q.setString("categoryLogo", categoryLogoName);
			q.setString("categoryName", categoryName);
			q.executeUpdate();
			commit();
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not update categories ", e);
        }
	}
	
	public void updateValueLogo(String valueLogoName, String categoryValue) 
			throws AdException {
		try {
            begin();
            System.out.println("Inside DAO with values"+" "+valueLogoName+" "+categoryValue);
            Query q = getSession().createQuery("update Category set valueLogo = :valueLogo where categoryValue = :categoryValue");
			q.setString("valueLogo", valueLogoName);
			q.setString("categoryValue", categoryValue);
			q.executeUpdate();
			commit();
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not update categories ", e);
        }
	}
	
	public List<Category> getCategory(Product product)
            throws AdException {
        try {
            begin();
            Query q = getSession().createQuery("from Category where product =:product");
            q.setInteger("product", product.getProductID());
            List<Category> categories = (List<Category>) q.list();
            commit();
            return categories;
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get categories ", e);
        }
    }
	
}
