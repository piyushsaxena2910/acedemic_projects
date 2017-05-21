/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.neu.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Piyush
 */
public class AddBooks extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession();
            String numberOfBooks = String.valueOf(session.getAttribute("numberOfBooks"));
            int number = Integer.parseInt(numberOfBooks);
            
            Connection conn = establishConnectionJDBC();
            
            for(int i = 1 ; i <= number; i++){
                String[] entry = request.getParameterValues(String.valueOf(i));
                String isbn = entry[0];
                String title = entry[1];
                String author = entry[2];
                String price = entry[3];
                
                String queryLogin = "insert into books values (?,?,?,?)";
                PreparedStatement loginStmt = conn.prepareStatement(queryLogin);
                loginStmt.setString(1, isbn);
                loginStmt.setString(2, title);
                loginStmt.setString(3, author);
                loginStmt.setString(4, price);
                loginStmt.executeUpdate();
            }
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/addedSuccessfully.jsp");
            rd.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AddBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    protected Connection establishConnectionJDBC() throws IOException{
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Where is your mysql JDBC Driver");
            e.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksdb","admin","password");
        }
        catch(SQLException e){
            System.out.println("Connection Failed!");
        }
        if(connection!=null){
            System.out.println("You made it, take control of Database");
        }
        return connection;
    }
}
