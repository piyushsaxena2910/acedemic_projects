/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import org.json.JSONObject;
import com.neu.edu.DAO.CsvDAO;
import com.neu.edu.DAO.SalesDAO;
import com.neu.edu.pojo.SalesOrder;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Piyush
 */

public class AppendData implements Controller{
    
    
    int selection=0;
    SalesDAO salesDAO;
    CsvDAO csvDAO;
    ArrayList<SalesOrder> sOrder=new ArrayList<>();

    public AppendData (CsvDAO csvDAO)
    {
        this.csvDAO=csvDAO;
    }
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
            ModelAndView mav=new ModelAndView();

            HttpSession session=request.getSession();
            String csvName=(String)session.getAttribute("csvName");
            String value=request.getParameter("hidden");
                    if(value==null)
                    {

                    
       ArrayList<SalesOrder> columnContent=csvDAO.getConnection(csvName);
      
       selection=1;
       
       session.setAttribute("selection", selection);
       session.setAttribute("columnContent", columnContent);
       
       sOrder=columnContent;
      
       JSONObject obj=new JSONObject();
       obj.put("sOrder", sOrder);
       PrintWriter out=response.getWriter();
       out.println(obj);
//                    PrintWriter out = response.getWriter();
//                    
//                    
//                    
//                    out.println(sOrder.get(0).getSalesPersonID());
//                    out.println(sOrder.get(0).getBillToAddressID());
//                    out.println(sOrder.get(0).getOnlineOrderFlag());
//      

//
//       
//mav.addObject("columnContent", columnContent);
//          mav.setViewName("check");
                }
                
                else if(value=="responseText")
                {
                    System.out.println("response receieved");
                    
                    
                    
                }
        
        return mav;
    }
    
}
