/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.neu.Controller;

import com.edu.neu.Bean.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class AddBrowseMovies extends HttpServlet {

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
            
            Connection conn = null;
            Statement statement = null;
            ResultSet resultSet = null;
            
            String value = request.getParameter("hidden");
            if(value.equals("add")){
                conn = establishConnectionJDBC();
                
                String title = request.getParameter("title");
                String actor = request.getParameter("actor");
                String actress = request.getParameter("actress");
                String genre = request.getParameter("genre");
                String year = request.getParameter("year");
                
                String queryToAddMovie = "insert into movies values ('" + title + "','" + actor + "','" + actress + "','" + genre + "','" + year + "')";
                statement = conn.createStatement();
                int result = statement.executeUpdate(queryToAddMovie);
                
                if(result>0){
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/addedSuccessfully.jsp");
                rd.forward(request, response);
                }
            }
            else if(value.equals("browse")){
                conn = establishConnectionJDBC();
                if(request.getParameter("searchBy").equals("title")){
                    String searchParameter = request.getParameter("keyword");
                    HttpSession session = request.getSession();
                    session.setAttribute("keyword", searchParameter);
                    
                    String queryToBrowseMovie = "select * from movies where title like ?";
                    PreparedStatement msgStmt = conn.prepareStatement(queryToBrowseMovie);
                    msgStmt.setString(1, "%" + searchParameter + "%");
                    resultSet = msgStmt.executeQuery();
                    
                    ArrayList<Movie> movieList = new ArrayList<>();
                    while(resultSet.next()){
                        Movie movie = new Movie();
                        movie.setTitle(resultSet.getString("title"));
                        movie.setActor(resultSet.getString("actor"));
                        movie.setActress(resultSet.getString("actress"));
                        movie.setGenre(resultSet.getString("genre"));
                        movie.setYear(Integer.parseInt(resultSet.getString("year")));
                        movieList.add(movie);
                    }
                    session.setAttribute("movieResultList", movieList);
                    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/searchResults.jsp");
                    rd.forward(request, response);
                    }
                else if(request.getParameter("searchBy").equals("actor")){
                    String searchParameter = request.getParameter("keyword");
                    HttpSession session = request.getSession();
                    session.setAttribute("keyword", searchParameter);
                    
                    String queryToBrowseMovie = "select * from movies where actor like ?";
                    PreparedStatement msgStmt = conn.prepareStatement(queryToBrowseMovie);
                    msgStmt.setString(1, "%" + searchParameter + "%");
                    resultSet = msgStmt.executeQuery();

                    ArrayList<Movie> movieList = new ArrayList<>();
                    while(resultSet.next()){
                        Movie movie = new Movie();
                        movie.setTitle(resultSet.getString("title"));
                        movie.setActor(resultSet.getString("actor"));
                        movie.setActress(resultSet.getString("actress"));
                        movie.setGenre(resultSet.getString("genre"));
                        movie.setYear(Integer.parseInt(resultSet.getString("year")));
                        movieList.add(movie);
                    }
                    session.setAttribute("movieResultList", movieList);
                    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/searchResults.jsp");
                    rd.forward(request, response);
                }
                else if(request.getParameter("searchBy").equals("actress")){
                    String searchParameter = request.getParameter("keyword");
                    HttpSession session = request.getSession();
                    session.setAttribute("keyword", searchParameter);
                    
                    String queryToBrowseMovie = "select * from movies where actress like ?";
                    PreparedStatement msgStmt = conn.prepareStatement(queryToBrowseMovie);
                    msgStmt.setString(1, "%" + searchParameter + "%");
                    resultSet = msgStmt.executeQuery();

                    ArrayList<Movie> movieList = new ArrayList<>();
                    while(resultSet.next()){
                        Movie movie = new Movie();
                        movie.setTitle(resultSet.getString("title"));
                        movie.setActor(resultSet.getString("actor"));
                        movie.setActress(resultSet.getString("actress"));
                        movie.setGenre(resultSet.getString("genre"));
                        movie.setYear(Integer.parseInt(resultSet.getString("year")));
                        movieList.add(movie);
                    }
                    session.setAttribute("movieResultList", movieList);
                    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/searchResults.jsp");
                    rd.forward(request, response);
                }
            }
            else{
                RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Views/index.jsp");
                rd.forward(request, response);
            }
        }
    }
    
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
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesdb","admin","password");
        }
        catch(SQLException e){
            System.out.println("Connection Failed!");
        }
        if(connection!=null){
            System.out.println("You made it, take control of Database");
        }
        return connection;
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
            Logger.getLogger(AddBrowseMovies.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AddBrowseMovies.class.getName()).log(Level.SEVERE, null, ex);
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

}
