/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.general;

import com.edu.neu.Items.InitializeProducts;
import com.edu.neu.Items.Products;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Piyush
 */
public class AddToCart extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Set<Products> myProducts;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            List<Products> productList = new ArrayList<>();
            InitializeProducts ip = new InitializeProducts();
            productList = ip.getAvailableProducts();
            HttpSession session = request.getSession();
            if(null!=session.getAttribute("myProductList")){
                myProducts = (Set<Products>)session.getAttribute("myProductList");
            }
            else{
                myProducts = new HashSet<Products>();
            }
            try{
                String action = request.getParameter("action");
                if(action==null){
                String[] selectedProducts = request.getParameterValues("product");
                for(int i = 0; i < selectedProducts.length; i++){
                    for(Products product : productList){
                    if(product.getProductName().equals(selectedProducts[i])){
                        myProducts.add(product);
                    }
                }
                }
                }
                else if(action.equals("removeProduct")){
                    boolean check = false;
                String removeProduct = request.getParameter("productName");
                Iterator iterator = myProducts.iterator();
                while(iterator.hasNext()){
                    if(check) break;
                    Products product = (Products)iterator.next();
                    if(product.getProductName().equals(removeProduct)){
                        myProducts.remove(product);
                        check = true;
                    }
                }
                }
            }
            catch(Exception e){
                
            }
            session.setAttribute("myProductList", myProducts);
            response.sendRedirect("viewLastAddedProduct.jsp");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddToCart</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>here</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    

}
