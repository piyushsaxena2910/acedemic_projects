/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import com.neu.edu.DAO.CsvDAO;
import com.neu.edu.DAO.SalesDAO;
import com.neu.edu.pojo.SalesOrder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author Piyush
 */
public class FormController implements Controller {

    int selection = 0;
    SalesDAO salesDAO;
    CsvDAO csvDAO;
    ArrayList<SalesOrder> sOrder = new ArrayList<>();

    public FormController(SalesDAO salesDAO, CsvDAO csvDAO) {
        this.salesDAO = salesDAO;
        this.csvDAO = csvDAO;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();

        int number=0;
        String csvName=null;
        String value = request.getParameter("hidden");
        String valueNew=request.getParameter("submit");
        if (value.equals("hidden")) {

             csvName= request.getParameter("csvName");
            if (csvName.equals("SalesOrder")) {

                try {

                    ArrayList<SalesOrder> columnContent = csvDAO.getConnection(csvName,number);

                    selection = 1;

                    session.setAttribute("selection", selection);
                    session.setAttribute("columnContent", columnContent);
                    session.setAttribute("csvName",csvName);

                    sOrder = columnContent;

                    session.setAttribute("csvName", csvName);
                    mav.addObject("columnContent", columnContent);
                    mav.setViewName("index");

                } catch (Exception e) {
                    e.printStackTrace();

                }
            } else {
                mav.setViewName("error");
            }
        } 
        
              if (valueNew.equals("1") || valueNew.equals("2") || valueNew.equals("3") || valueNew.equals("4") || valueNew.equals("5") || valueNew.equals("6") || valueNew.equals("7") || valueNew.equals("8") || valueNew.equals("9") || valueNew.equals("10"))  {


          
                try {

                    String csv=(String)session.getAttribute("csvName");
                    int num=Integer.parseInt(request.getParameter("submit"));
                            
                    ArrayList<SalesOrder> columnContent = csvDAO.getConnection(csv,num);

                    selection = 1;

                    session.setAttribute("selection", selection);
                    session.setAttribute("columnContent", columnContent);
                    session.setAttribute("csvName",csv);

                    sOrder = columnContent;

                    mav.addObject("columnContent", columnContent);
                    mav.setViewName("index");

                } catch (Exception e) {
                    e.printStackTrace();

                }
           
        }
              else if(valueNew.equals("Next10"))
              {
               
                  try {

                    String csv=(String)session.getAttribute("csvName");
                    
                            
                    ArrayList<SalesOrder> columnContent = csvDAO.getConnectionNext(csv);

                    selection = 1;

                    session.setAttribute("selection", selection);
                    session.setAttribute("columnContent", columnContent);
                    session.setAttribute("csvName",csv);

                    sOrder = columnContent;

                    mav.addObject("columnContent", columnContent);
                    mav.setViewName("index");

                } catch (Exception e) {
                    e.printStackTrace();

                }
                  
              }
       

        return mav;
    }

}
