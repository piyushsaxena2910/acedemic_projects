/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Piyush
 */
public class AddBooksController implements Controller {

        Connection conn=null;
       
        String query=null;
        int resultSet=0;
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
         //To change body of generated methods, choose Tools | Templates.
         HttpSession session=request.getSession();
         ModelAndView mav = new ModelAndView();
         String value=request.getParameter("hidden");
         if(value.equals("hidden"))
         {
             String val=request.getParameter("quantity");
             session.setAttribute("val", val);
             mav.addObject(val);
             mav.setViewName("addBooks");
      
         }
         else if(value.equals("hidden2"))
         {
              String val=(String)session.getAttribute("val");
                        conn=establishConnectionJDBC();
                        int numberVal=Integer.parseInt(val);
                        
                        for (int i=1;i<=numberVal;i++)
                        {
                            String isbn=request.getParameter("isbn"+i);
                            
                            String title=request.getParameter("title"+i);
                            String author=request.getParameter("author"+i);
                            String price=request.getParameter("price"+i);
                            
                            query="insert into books values (?,?,?,?);";
                            
                         
                            PreparedStatement msgStmt = conn.prepareStatement(query);
                            msgStmt.setString(1,isbn);
                            msgStmt.setString(2,title);
                            msgStmt.setString(3,author);
                            msgStmt.setString(4,price);
                            
                        
            resultSet = msgStmt.executeUpdate();
            
                        }
                        mav.addObject(resultSet);
                        mav.setViewName("viewBooks");

         }
         return mav;
                 
         
    }
    
        protected Connection establishConnectionJDBC() throws IOException
    {
        Connection connection = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Where is your mysql JDBC Driver");
            e.printStackTrace();
        }
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksdb","root","root");
        }
        catch(SQLException e)
        {
            System.out.println("Connection failed!");
        }
        if(connection!=null)
        {
            System.out.println("You made it,take control of database");
        }
        return connection;
    }

    
}
