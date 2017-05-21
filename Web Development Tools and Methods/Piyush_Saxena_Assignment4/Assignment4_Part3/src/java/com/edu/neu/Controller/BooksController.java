/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.neu.Controller;

import com.neu.edu.DAO.BooksDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Piyush
 */
public class BooksController implements Controller{
    
    BooksDAO booksDAO;
    int val;
    
    public BooksController(BooksDAO booksDAO)
    {
        this.booksDAO = booksDAO;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        String action = request.getParameter("numberOfBook");
        ModelAndView mv = new ModelAndView();
        int count=0;
        if(action.equals("numberOfBook")){
            int numberOfBooks = Integer.parseInt(request.getParameter("numberOfBooks"));
            session.setAttribute("numberOfBooks", numberOfBooks);
            mv.setViewName("books");
        }
        else if(action.equals("number")){
        
            String numberOfBooks = String.valueOf(session.getAttribute("numberOfBooks"));
            int number = Integer.parseInt(numberOfBooks);
            for(int i = 1 ; i <= number; i++){
                String[] entry = request.getParameterValues(String.valueOf(i));
                val=booksDAO.addBooks(entry);
                count++;
    }
            String result = String.valueOf(count);
            session.setAttribute("result",result);
            mv.setViewName("addedSuccessfully");
    }
        
    return mv;
    }
    }
