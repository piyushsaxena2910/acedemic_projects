package com.webtools.cms.DAO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Article;
import com.webtools.cms.pojo.Aside;
import com.webtools.cms.pojo.Footer;
import com.webtools.cms.pojo.Header;
import com.webtools.cms.pojo.Navigator;
import com.webtools.cms.pojo.Page;
import com.webtools.cms.pojo.Product;
import com.webtools.cms.pojo.ProductCatalog;
import com.webtools.cms.pojo.Section;

public class ProductsDAO extends DAO{

	public List<Product> getProducts(String productCatalogID) throws AdException{
        try {
            begin();
            System.out.println("inside products DAO");
            Query q = getSession().createQuery("from Product where productCatalogID = :productCatalogID");
            q.setString("productCatalogID", productCatalogID);
            List<Product> products = q.list();
            System.out.println("Size of list products -> "+products.size());
            commit();
            return products;
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get product ", e);
        }
}
	public Product getProductByID(String productID) throws AdException{
        try {
            begin();
            Query q = getSession().createQuery("from Product where productID = :productID");
            q.setString("productID", productID);
            List<Product> products = q.list();
            commit();
            return products.get(0);
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get product ", e);
        }
}
	public Product getProductByName(String productName) throws AdException{
        try {
            begin();
            System.out.println("Product name passed is -> "+productName);
            Query q = getSession().createQuery("from Product where productName = :productName");
            q.setString("productName", productName);
            List<Product> products = q.list();
            commit();
            return products.get(0);
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get product ", e);
        }
}
	public Product create(ProductCatalog productCatalogForProducts, String productName, String productPrice)  throws AdException{
		try {
            begin();
            System.out.println("inside DAO");
            
            Product product = new Product();
            
            product.setProductCatalogForProducts(productCatalogForProducts);
            product.setProductName(productName);
            product.setProductPrice(productPrice);
            
            productCatalogForProducts.getProducts().add(product);
            getSession().save(product);
            
            commit();
            return product;
            
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while creating Product: " + e.getMessage());
        }
		
	}
}