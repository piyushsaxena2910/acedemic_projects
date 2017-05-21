/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import com.neu.edu.DAO.SalesDAO;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Piyush
 */
public class SaveDataController implements Controller {

    SalesDAO  salesDAO;
    int count=0;
    
    public SaveDataController(SalesDAO salesDAO)
    {
        this.salesDAO=salesDAO;
    }
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
           ModelAndView mav=new ModelAndView();
                
        HttpSession session=request.getSession();
        String csvName=(String)session.getAttribute("csvName");
        String value=request.getParameter("hidden");
                if(value==null)
                {
        
               String br =  request.getReader().readLine();
               br = br.replaceAll("\\s","").replace("Save","").replace("Delete","");
               String parts[]=br.split("\\\\n");
               
               if(parts[0].equals(""))
               {
       
           
               int i=3;
               int rowsUpdated=salesDAO.insertIntoDB(parts);
               session.setAttribute("selection",i );
               mav.setViewName("index");
               }
               
               else
               {
               int i=3;
               int rowsUpdated=salesDAO.insertIntoDBNext100(parts);
               session.setAttribute("selection",i );
               mav.setViewName("index");   
                   
               }
        
                }
                
                return mav;
        
    }
    

}
