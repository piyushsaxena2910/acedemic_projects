/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.neu.Controller;

import com.edu.neu.DAO.SalesOrderDAO;
import com.edu.neu.DAO.SalesOrderSQLDAO;
import com.edu.neu.POJO.SalesOrder;
import java.sql.ResultSet;
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
public class SalesOrderController implements Controller{

    SalesOrderDAO salesOrderDAO;
    SalesOrderSQLDAO salesOrderSQLDAO;
    public SalesOrderController(SalesOrderDAO salesOrderDAO, SalesOrderSQLDAO salesOrderSQLDAO) {
        this.salesOrderDAO = salesOrderDAO;
        this.salesOrderSQLDAO = salesOrderSQLDAO;
    
    }
    ArrayList<SalesOrder> orders = null;
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        String action = hsr.getParameter("action");
        ModelAndView mv = new ModelAndView();
        if(action.equals("viewAllRecords")){
            HttpSession session = hsr.getSession();
            int i = 1;
            session.setAttribute("pageNode", i);
            mv.setViewName("index");
        }
        else if(action.equals("insertAllRecords")){
            SalesOrderSQLDAO sosd = new SalesOrderSQLDAO();
            HttpSession session = hsr.getSession();
            orders = (ArrayList<SalesOrder>) session.getAttribute("salesOrders");
            int n = sosd.addBooks(orders);
            int i = 2;
            session.setAttribute("pageNode", i);
            session.setAttribute("numberOfRowsAdded", n);
            mv.setViewName("index");
        }
        return mv;
    }
    
}
