/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Piyush
 */
public class DisplayFormServlet extends HttpServlet {

        String firstName;
        String lastName;
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DisplayFormServlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        HttpSession session = request.getSession();
        sendPage1(response);
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
        HttpSession session = request.getSession();
        String pageValue = request.getParameter("page");
        
        if(pageValue.equals("1")){
            String firstName = request.getParameter("fName");
            String lastName = request.getParameter("lName");
            session.setAttribute("firstName", firstName);
            session.setAttribute("lastName", lastName);
            String answerForQ1 = request.getParameter("answerQ1");
            session.setAttribute("answerForQ1", answerForQ1);
            sendPage2(response);
        }
        else if(pageValue.equals("2")){   
            String answerForQ2 = request.getParameter("answerQ2");
            session.setAttribute("answerForQ2", answerForQ2);
            sendPage3(response);
        }
        else if(pageValue.equals("3")){
            String answerForQ3 = request.getParameter("answerQ3");
            session.setAttribute("answerForQ3", answerForQ3);
            sendPage4(response);
        }
        else if(pageValue.equals("4")){
            String answerForQ4 = request.getParameter("answerQ4");
            session.setAttribute("answerForQ4", answerForQ4);
            sendPage5(response);
        }
        else if(pageValue.equals("5")){
            String answerForQ5 = request.getParameter("answerQ5");
            session.setAttribute("answerForQ5", answerForQ5);
            sendPage6(response);
        }
        else if(pageValue.equals("6")){
            String answerForQ6 = request.getParameter("answerQ6");
            session.setAttribute("answerForQ6", answerForQ6);
            sendPage7(response);
        }
        else if(pageValue.equals("7")){
            String answerForQ7 = request.getParameter("answerQ7");
            session.setAttribute("answerForQ7", answerForQ7);
            sendPage8(response);
        }
        else if(pageValue.equals("8")){
            String answerForQ8 = request.getParameter("answerQ8");
            session.setAttribute("answerForQ8", answerForQ8);
            sendPage9(response);
        }
        else if(pageValue.equals("9")){
            String answerForQ9 = request.getParameter("answerQ9");
            session.setAttribute("answerForQ9", answerForQ9);
            sendPage10(response);
        }
        else if(pageValue.equals("10")){
            String answerForQ10 = request.getParameter("answerQ10");
            session.setAttribute("answerForQ10", answerForQ10);
            displayResults(request, response);
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

    private void sendPage1(HttpServletResponse response) throws IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Enter First Name");
            out.println("<input type ='text' name='fName'><br/>");
            out.println("<p>Enter Last Name");
            out.println("<input type ='text' name='lName'><br/>");
            out.println("<p>Q1. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ1' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ1' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ1' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ1' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='1'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void sendPage2(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Q2. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ2' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ2' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ2' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ2' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='2'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void sendPage3(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Q3. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ3' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ3' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ3' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ3' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='3'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void sendPage4(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Q4. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ4' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ4' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ4' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ4' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='4'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void sendPage5(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Q5. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ5' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ5' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ5' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ5' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='5'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void sendPage6(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Q6. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ6' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ6' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ6' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ6' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='6'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void sendPage7(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Q7. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ7' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ7' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ7' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ7' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='7'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void sendPage8(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Q8. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ8' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ8' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ8' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ8' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='8'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void sendPage9(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Q9. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ9' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ9' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ9' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ9' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='9'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void sendPage10(HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form method='post'>");
            out.println("<p>Q10. Select the right answer<br/>");
            out.println("<input type ='radio' name='answerQ10' value='1'>One<br/>");
            out.println("<input type ='radio' name='answerQ10' value='2'>Two<br/>");
            out.println("<input type ='radio' name='answerQ10' value='3'>Three<br/>");
            out.println("<input type ='radio' name='answerQ10' value='4'>Four<br/>");
            out.println("<input type='hidden' name='page' value='10'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }

    private void displayResults(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Your First Name : "+session.getAttribute("firstName"));
            out.println("<p>Your Last Name : "+session.getAttribute("lastName"));
            out.println("<p>Your answer for Question1->"+session.getAttribute("answerForQ1")+"<br/>");
            out.println("<p>Your answer for Question2->"+session.getAttribute("answerForQ2")+"<br/>");
            out.println("<p>Your answer for Question3->"+session.getAttribute("answerForQ3")+"<br/>");
            out.println("<p>Your answer for Question4->"+session.getAttribute("answerForQ4")+"<br/>");
            out.println("<p>Your answer for Question5->"+session.getAttribute("answerForQ5")+"<br/>");
            out.println("<p>Your answer for Question6->"+session.getAttribute("answerForQ6")+"<br/>");
            out.println("<p>Your answer for Question7->"+session.getAttribute("answerForQ7")+"<br/>");
            out.println("<p>Your answer for Question8->"+session.getAttribute("answerForQ8")+"<br/>");
            out.println("<p>Your answer for Question9->"+session.getAttribute("answerForQ9")+"<br/>");
            out.println("<p>Your answer for Question10->"+session.getAttribute("answerForQ10")+"<br/>");
            out.println("</body>");
            out.println("</html>");
    }


}