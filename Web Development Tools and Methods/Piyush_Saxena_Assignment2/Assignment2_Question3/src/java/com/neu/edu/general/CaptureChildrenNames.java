/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.general;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Piyush
 */
public class CaptureChildrenNames extends HttpServlet {

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
            out.println("<title>CaptureChildrenNames</title>");  
            out.println("<script>");
            out.println("function myFunction(){");
                out.println("var numberOfChildren = document.getElementById('1').value;");
                out.println("document.getElementById('1').style.visibility = 'hidden';");
                out.println("document.getElementById('2').style.visibility = 'hidden';");
                out.println("document.getElementsByTagName('p')[0].style.visibility = 'hidden';");
                out.println("var f = document.createElement(\"form\");");
                out.println("f.setAttribute('method',\"POST\");");
                out.println("f.setAttribute('action',\"CaptureChildrenNames\");");
                out.println("for(var i = 0; i < numberOfChildren; i++){");
                    out.println("var j = i+1;");
                    out.println("document.write('<p>Please enter the name of child number' + j);");
                    out.println("var txtBox = document.createElement(\"input\");");
                    out.println("txtBox.setAttribute('type',\"text\");");
                    out.println("txtBox.setAttribute('name','name'+i);");
                    out.println("f.appendChild(txtBox);");
                    out.println("}");
            out.println("var submitBtnNew = document.createElement('input');");
            out.println("submitBtnNew.setAttribute('type','submit');");
            out.println("submitBtnNew.setAttribute('value','Submit');");
            out.println("f.appendChild(submitBtnNew);");
            out.println("document.getElementsByTagName('html')[0].appendChild(f);");
            out.println("}");
        out.println("</script>");
            out.println("</head>");
            
    out.println("<body>");
        
        out.println("<script>");
            out.println("var f = document.createElement('div');");
            out.println("var numberOfChildrenTxtF = document.createElement('p');");
            out.println("numberOfChildrenTxtF.innerHTML = 'How many children do you have?';");
            out.println("var numberOfChildrenTxtBox = document.createElement('input');");
            out.println("numberOfChildrenTxtBox.setAttribute('type','text');");
            out.println("numberOfChildrenTxtBox.setAttribute('name','numberOfChildren');");
            out.println("numberOfChildrenTxtBox.setAttribute('id','1');");
            out.println("var submitBtn = document.createElement('input');");
            out.println("submitBtn.setAttribute('type','submit');");
            out.println("submitBtn.setAttribute('value','Button');");
            out.println("submitBtn.setAttribute('onClick','myFunction()');");
            out.println("submitBtn.setAttribute('id','2');");
            out.println("f.appendChild(numberOfChildrenTxtF);");
            out.println("f.appendChild(numberOfChildrenTxtBox);");
            out.println("f.appendChild(submitBtn);");
            out.println("document.getElementsByTagName('body')[0].appendChild(f);");
            out.println("</script>");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //processRequest(request, response);
        
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CaptureChildrenNames</title>");
            out.println("</head>");
            out.println("<body>");
            Enumeration names = request.getParameterNames();
            while(names.hasMoreElements()){
                String name = (String)names.nextElement();
                String value = request.getParameter(name);
                out.println("<h3>"+value+"</h3>");
            }
            out.println("</body>");
            out.println("</html>");
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
