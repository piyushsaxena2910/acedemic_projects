package com.webtools.cms.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Article;
import com.webtools.cms.pojo.Aside;
import com.webtools.cms.pojo.Footer;
import com.webtools.cms.pojo.Header;
import com.webtools.cms.pojo.Navigator;
import com.webtools.cms.pojo.Page;
import com.webtools.cms.pojo.ProductCatalog;
import com.webtools.cms.pojo.Section;
import com.webtools.cms.pojo.User;

public class ApplicationDAO extends DAO{
	
	public Application createApplication(String applicationName) throws AdException{
		try {
            begin();
            System.out.println("inside DAO");
            
            Application application = new Application(applicationName);
            ProductCatalog pc = new ProductCatalog();
            application.setProductCatalog(pc);
            getSession().save(application);
            
            commit();
            return application;
            
        } catch (HibernateException e) {
            rollback();
            throw new AdException("Exception while creating application: " + e.getMessage());
        }
		
	}
	
	public List<Application> getApplication()
            throws AdException {
        try {
            begin();
            Query q = getSession().createQuery("from Application");
            List<Application> application = (List<Application>) q.list();
            commit();
            return application;
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get application ", e);
        }
    }
	
	public Application getApplication(String applicationName)
            throws AdException {
        try {
        	Criteria crit = getSession().createCriteria(Application.class);
    		crit.add(Restrictions.eq("applicationName", applicationName));
    		List<Application> applicationList = crit.list();
    		return applicationList.get(0);
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get application ", e);
        }
    }
	
	public Application getApplicationWithApplicationID(int applicationID)
            throws AdException {
        try {
            begin();
            Query q = getSession().createQuery("from Application where applicationID = :applicationID");
            q.setInteger("applicationID", applicationID);
            Application application = (Application) q.uniqueResult();
            System.out.println("Appliaction name"+application);
            commit();
            return application;
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get application ", e);
        }
    }

	public void updateSequence(String applicationName, String sequenceToSave) throws AdException {
		try{
			begin();
			Query q = getSession().createQuery("update Application set flow = :flow where applicationName = :applicationName");
			q.setString("flow", sequenceToSave);
			q.setString("applicationName", applicationName);
			q.executeUpdate();
			commit();
		}
		catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not update application ", e);
        }
	}

}
