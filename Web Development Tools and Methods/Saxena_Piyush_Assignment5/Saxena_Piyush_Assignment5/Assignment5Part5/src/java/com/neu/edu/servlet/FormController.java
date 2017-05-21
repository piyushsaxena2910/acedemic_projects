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

        String value = request.getParameter("hidden");
        
        if (value.equals("hidden")) {

            String csvName = request.getParameter("csvName");
            if (csvName.equals("SalesOrder")) {

                try {

                    ArrayList<SalesOrder> columnContent = csvDAO.getConnection(csvName);

                    selection = 1;

                    session.setAttribute("selection", selection);
                    session.setAttribute("columnContent", columnContent);
                    session.setAttribute("csvName",csvName);

                    sOrder = columnContent;

                    mav.addObject("columnContent", columnContent);
                    mav.setViewName("index");

                } catch (Exception e) {
                    e.printStackTrace();

                }
            } else {
                mav.setViewName("error");
            }
        } 

        return mav;
    }

}
