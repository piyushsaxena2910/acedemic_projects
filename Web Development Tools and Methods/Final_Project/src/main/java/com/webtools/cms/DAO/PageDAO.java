package com.webtools.cms.DAO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.webtools.cms.pojo.Application;
import com.webtools.cms.pojo.Article;
import com.webtools.cms.pojo.Aside;
import com.webtools.cms.pojo.Footer;
import com.webtools.cms.pojo.Header;
import com.webtools.cms.pojo.Navigator;
import com.webtools.cms.pojo.Page;
import com.webtools.cms.pojo.Section;
import com.webtools.cms.exception.AdException;

public class PageDAO extends DAO{

	public Page create(Application application, String pageName, String articleValue, String asideValue, String footerValue, String headerValue, String navigatorValue,
			String sectionValue)  throws AdException{
		try {
            begin();
            System.out.println("inside DAO");
            
            Page page = new Page(pageName);
            
            Article article = new Article(articleValue);
            Aside aside = new Aside(asideValue);
            Footer footer = new Footer(footerValue);
            Header header = new Header(headerValue);
            Navigator navigator = new Navigator(navigatorValue);
            Section section = new Section(sectionValue);
            
            System.out.print("Testing print application"+application.getApplicationName());
            //page.setApplication(application);
            page.setApplicationID(application);
            page.setArticle(article);
            page.setAside(aside);
            page.setFooter(footer);
            page.setHeader(header);
            page.setNavigator(navigator);
            page.setSection(section);
            
            Date createdOn = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = sdf.format(createdOn);
            page.setCreatedOn(currentTime);
            
            application.getPages().add(page);
            getSession().save(page);
            
            commit();
            return page;
            
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while creating Page: " + e.getMessage());
        }
		
	}

	public Page getPage(String pageName) throws AdException{
	        try {
	            begin();
	            Query q = getSession().createQuery("from Page where pageName = :pageName");
	            q.setString("pageName", pageName);
	            Page page = (Page) q.uniqueResult();
	            commit();
	            return page;
	        } catch (HibernateException e) {
	            rollback();
	            System.out.println(e);
	            throw new AdException("Could not get page ", e);
	        }
	}
	
	public Page update(Application application, String pageName, String articleValue, String asideValue, String footerValue, String headerValue, String navigatorValue,
			String sectionValue)  throws AdException{
		try {
            begin();
            System.out.println("inside DAO");
            
            Page page = getPage(pageName);
            page.setApplicationID(application);
            page.getArticle().setArticle(articleValue);
            page.getAside().setAside(asideValue);
            page.getFooter().setFooter(footerValue);
            page.getHeader().setHeader(headerValue);
            page.getNavigator().setNavigator(navigatorValue);
            page.getSection().setSection(sectionValue);
            
            Date createdOn = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = sdf.format(createdOn);
            page.setCreatedOn(currentTime);
            
            Query q1 = getSession().createQuery("update Article set article = :articleVal where articleID = :articleID");
            q1.setString("articleVal", articleValue);
            q1.setInteger("articleID", page.getArticle().getArticleID());
            q1.executeUpdate();
            
            Query q2 = getSession().createQuery("update Aside set aside = :asideVal where asideID = :asideID");
            q2.setString("asideVal", asideValue);
            q2.setInteger("asideID", page.getAside().getAsideID());
            q2.executeUpdate();
            
            Query q3 = getSession().createQuery("update Header set header = :headerVal where headerID = :headerID");
            q3.setString("headerVal", headerValue);
            q3.setInteger("headerID", page.getHeader().getHeaderID());
            q3.executeUpdate();
            
            Query q4 = getSession().createQuery("update Footer set footer = :footerVal where footerID = :footerID");
            q4.setString("footerVal", footerValue);
            q4.setInteger("footerID", page.getFooter().getFooterID());
            q4.executeUpdate();
            
            Query q5 = getSession().createQuery("update Navigator set navigator = :navigatorVal where navigatorID = :navigatorID");
            q5.setString("navigatorVal", navigatorValue);
            q5.setInteger("navigatorID", page.getNavigator().getNavigatorID());
            q5.executeUpdate();
            
            Query q6 = getSession().createQuery("update Section set section = :sectionVal where sectionID = :sectionID");
            q6.setString("sectionVal", sectionValue);
            q6.setInteger("sectionID", page.getSection().getSectionID());
            q6.executeUpdate();
            System.out.println("going to commit");
            return page;
            
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while updating Page: " + e.getMessage());
        }
		
	}

	public List<Page> getPages(int applicationID) throws AdException {
		try {
            begin();
            Query q = getSession().createQuery("from Page where applicationID = :applicationID order by createdOn");
            q.setInteger("applicationID", applicationID);
            List<Page> pages = (List<Page>) q.list();
            commit();
            return pages;
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get pages ", e);
        }
		
	}
}
