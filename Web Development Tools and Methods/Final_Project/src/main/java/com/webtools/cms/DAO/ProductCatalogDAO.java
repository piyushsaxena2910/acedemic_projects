package com.webtools.cms.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.ProductCatalog;

public class ProductCatalogDAO extends DAO{

	public ProductCatalog getProductCatalog(int productCatalogID)
            throws AdException {
        try {
            begin();
            Query q = getSession().createQuery("from ProductCatalog where productCatalogID = :productCatalogID");
            q.setInteger("productCatalogID", productCatalogID);
            ProductCatalog productCatalog = (ProductCatalog) q.uniqueResult();
            commit();
            return productCatalog;
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get ProductCatalog ", e);
        }
    }
}
