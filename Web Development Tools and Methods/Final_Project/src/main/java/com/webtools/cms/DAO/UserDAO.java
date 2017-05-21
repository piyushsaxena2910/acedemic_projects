package com.webtools.cms.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.webtools.cms.exception.AdException;
import com.webtools.cms.pojo.User;

public class UserDAO extends DAO {

    public UserDAO() {
    }

    public User get(String username, String password)
            throws AdException {
        try {
            begin();
            Query q = getSession().createQuery("from User where username = :username and password =:password");
            q.setString("username", username);
            q.setString("password", password);
            User user = (User) q.uniqueResult();
            //commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            System.out.println(e);
            throw new AdException("Could not get user " + username, e);
        }
    }

	public void createUser(String userName, String password, String role) throws AdException {
		try {
            begin();
            
            User user=new User();
            
            user.setUserName(userName);
            user.setPassword(password);
            user.setRole(role);
            getSession().save(user);
            commit();
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while creating user: " + e.getMessage());
        }
		
	}

    /*public User create(String username, String password,String emailId, String firstName, String lastName)
            throws AdException {
        try {
            begin();
            System.out.println("inside DAO");
            
            Email email=new Email(emailId);
            User user=new User(username,password);
            
            user.setFirstName(firstName);
            user.setLastName(lastName);
            
            user.setEmail(email);
            
            email.setUser(user);
            
            getSession().save(user);
            
            commit();
            return user;
        } catch (HibernateException e) {
            rollback();
            //throw new AdException("Could not create user " + username, e);
            throw new AdException("Exception while creating user: " + e.getMessage());
        }
    }

    public void delete(User user)
            throws AdException {
        try {
            begin();
            getSession().delete(user);
            commit();
        } catch (HibernateException e) {
            rollback();
            throw new AdException("Could not delete user " + user.getName(), e);
        }
    }*/
}