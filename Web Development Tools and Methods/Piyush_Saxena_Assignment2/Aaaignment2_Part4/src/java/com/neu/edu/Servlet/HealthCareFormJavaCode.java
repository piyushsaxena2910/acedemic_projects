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

/**
 *
 * @author Piyush
 */
public class HealthCareFormJavaCode extends HttpServlet {

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
            out.println("<title>Servlet HealthCareFormJavaCode</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HealthCareFormJavaCode at " + request.getContextPath() + "</h1>");
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
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head lang='en'><title>Health Care Form</title>");
		out.println("<link rel='stylesheet' type='text/css' href='mystyle.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src = 'header.PNG' style='width:1250px;'>");
		out.println("<form action = 'HealthCareFormJavaCode' method = 'POST'>");
		out.println("<div id='d1'>");
		out.println("<div id='div1'>");
		out.println("<p class='one'>Your Information Here");
		out.println("<input type = 'checkbox' name = 'newAddress' value = 'newAddress'/>Check here if this is a new address</input>");
		out.println("</p>");
		out.println("</br>");
		out.println("Name:");
		out.println("<input type = 'text' name = 'firstName' required/>");
		out.println("</br>");
		out.println("Address:");
		out.println("<input type = 'text' name = 'address' required/>");
		out.println("</br>");
		out.println("City, State, Zip:");
		out.println("<input type = 'text' name = 'cityStateZip' required/>");
		out.println("</br>");
		out.println("Phone:");
		out.println("<input type = 'number' name = 'phone' min='1000000000' max='9999999999' required/>");
		out.println("Email:");
		out.println("<input type = 'email' name = 'email' required/>");
		out.println("</div>");
		out.println("<div id='div2'>");
		out.println("<p class='one'>Pet Information</p>");
		out.println("</br>");
		out.println("Account Number:");
		out.println("<input type = 'number' name = 'accountNumber'  min='1000000000' max='9999999999' required/>");
		out.println("</br>");
		out.println("Name:");
		out.println("<input type = 'text' name = 'petName' required/>");
		out.println("</br>");
		out.println("Breed:");
		out.println("<input type = 'text' name = 'breed' required/>");
		out.println("</br>");
		out.println("Age:");
		out.println("<input type = 'number' name = 'age'  min='1' max='99'  required/>");
		out.println("Gender:");
		out.println("<input type = 'text' name = 'gender' required/>");
		out.println("</div>");
		out.println("</div>");
		out.println("<img src = 'middleSection.PNG' style='width:1250px;'>");
		out.println("<div class = 'middle'>");
		out.println("Story of Occurrence/Diagnosis - Please describe this incident, including dates, details and symptoms leading up to it");
		out.println("<textarea rows='6' cols='150' name='StoryOfOccurrence' required/></textarea>");
		out.println("</div>");
		out.println("<div id='d2'>");
		out.println("<div id='div3'>");
		out.println("<p><i>This claim is related to:</i>");
		out.println("<input type = 'radio' name = 'ClaimRelatedTo' value = 'Accident' checked/>Accident</input>");
		out.println("<input type = 'radio' name = 'ClaimRelatedTo' value = 'Illness'>Illness</input>");
		out.println("<input type = 'radio' name = 'ClaimRelatedTo' value = 'Wellness'>Wellness</input>");
		out.println("</p>");
		out.println("</br>");
		out.println("<p>Is this claim an estimate for future treatment?");
		out.println("<input type = 'radio' name = 'FutureTreatment' value = 'Yes' checked/>Yes</input>");
		out.println("<input type = 'radio' name = 'FutureTreatment' value = 'No'>No</input>");
		out.println("</p>");
		out.println("</br>");
		out.println("Total amount claimed:");
		out.println("<input type = 'number' name = 'totalAmountClaimed' min='0' required/>");
		out.println("</br>");
		out.println("Date illness/injury first occurred:");
		out.println("<input type = 'date' name = 'injuryFirstOccured' required/>");
		out.println("</br>");
		out.println("<p>Send payment to: ");
		out.println("<input type = 'radio' name = 'PaymentTo' value = 'Me' checked/>Me</input>");
		out.println("<input type = 'radio' name = 'PaymentTo' value = 'Veterinarian'>Veterinarian</input>");
		out.println("</p>");
		out.println("</br>");
		out.println("</div>");
		out.println("<div id='div4'>");
		out.println("<p>Veterinarian:</p>");
		out.println("<input type = 'text' name = 'veterinarian' required/></input>");
		out.println("</br>");
		out.println("<p>Clinic Name:</p>");
		out.println("<input type = 'text' name = 'clinicName' required/></input>");
		out.println("</br>");
		out.println("Phone:");
		out.println("<input type = 'number' name = 'phoneClinic'  min='1000000000' max='9999999999' required/>");
		out.println("Fax:");
		out.println("<input type = 'number' name = 'fax'  min='1000000000' max='9999999999' required/>");
		out.println("</br>");
		out.println("<p>Did any other veterinarian treat your pet?:");
		out.println("<input type = 'radio' name = 'OtherVet' value = 'Yes' checked/>Yes</input>");
		out.println("<input type = 'radio' name = 'OtherVet' value = 'No'>No</input>");
		out.println("</p>");
		out.println("<p>Is this a new condition?:");
		out.println("<input type = 'radio' name = 'NewCondition' value = 'Yes' checked/>Yes</input>");
		out.println("<input type = 'radio' name = 'NewCondition' value = 'No'>No</input>");
		out.println("</p>");
		out.println("</br>");
		out.println("</div>");
		out.println("</div>");
		out.println("<img src = 'declaration.PNG' style='width:1250px;'>");
		out.println("<div>");
		out.println("</br>");
		out.println("<div id = 'div5'>");
		out.println("<p>Signature of Pet Owner:</p>");
		out.println("<input type = 'text' name = 'signature' required/>");
		out.println("</div>");
		out.println("</br>");
		out.println("<div id = 'div6'>");
		out.println("<p>Date:");
		out.println("<input type='date' name='datepicker' required/></p>");
		out.println("</div>");
		out.println("</br></br>");
		out.println("<input type = 'submit' value = 'Submit'</input>");
		out.println("</form>");
		out.println("<img src = 'footer.PNG' style='width:1250px;'>");
		out.println("</body>");
		out.println("</html>");
		out.close();
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
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String firstName=req.getParameter("firstName");
                firstName = firstName.replaceAll("[^(A-Za-z )]", "");
		String address=req.getParameter("address");
		String cityStateZip=req.getParameter("cityStateZip");
		String phone=req.getParameter("phone");
		String email=req.getParameter("email");
		String accountNumber=req.getParameter("accountNumber");
		String petName=req.getParameter("petName");
                petName = petName.replaceAll("[^(A-Za-z )]", "");
		String breed=req.getParameter("breed");
                breed = breed.replaceAll("[^(A-Za-z )]", "");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
                gender = gender.replaceAll("[^(A-Za-z )]", "");
		String StoryOfOccurrence=req.getParameter("StoryOfOccurrence");
		String ClaimRelatedTo=req.getParameter("ClaimRelatedTo");
		String FutureTreatment=req.getParameter("FutureTreatment");
		String totalAmountClaimed=req.getParameter("totalAmountClaimed");
		String injuryFirstOccured=req.getParameter("injuryFirstOccured");
		String PaymentTo=req.getParameter("PaymentTo");
		String veterinarian=req.getParameter("veterinarian");
                veterinarian = veterinarian.replaceAll("[^(A-Za-z )]", "");
		String clinicName=req.getParameter("clinicName");
                clinicName = clinicName.replaceAll("[^(A-Za-z )]", "");
		String phoneClinic=req.getParameter("phoneClinic");
		String fax=req.getParameter("fax");
		String OtherVet=req.getParameter("OtherVet");
		String NewCondition=req.getParameter("NewCondition");
		String signature=req.getParameter("signature");
                signature = signature.replaceAll("[^(A-Za-z )]", "");
		String dateOfSubmission=req.getParameter("datepicker");
                
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Health Care Form Details</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("Name: " + firstName + "<BR/>");
		out.println("Address: " + address + "<BR/>");
		out.println("City, State, ZIP: " + cityStateZip + "<BR/>");
		out.println("Phone: " + phone + "<BR/>");
		out.println("Email: " + email + "<BR/>");
		out.println("Account Number: " + accountNumber + "<BR/>");
		out.println("Pet Name: " + petName + "<BR/>");
		out.println("Breed: " + breed + "<BR/>");
		out.println("Age: " + age + "<BR/>");
		out.println("Gender: " + gender + "<BR/>");
		out.println("Story of Occurrence/Diagnosis: " + StoryOfOccurrence + "<BR/>");
		out.println("Claim is related to: " + ClaimRelatedTo + "<BR/>");
		out.println("Is this claim an estimate for future treatment? : " + FutureTreatment + "<BR/>");
		out.println("Total amount claimed: " + totalAmountClaimed + "<BR/>");
		out.println("Date illness/injury first occurred: " + injuryFirstOccured + "<BR/>");
		out.println("Send payment to: " + PaymentTo + "<BR/>");
		out.println("Veterinarian: " + veterinarian + "<BR/>");
		out.println("Clinic Name: " + clinicName + "<BR/>");
		out.println("Phone Clinic: " + phoneClinic + "<BR/>");
		out.println("Fax: " + fax + "<BR/>");
		out.println("Did any other veterinarian treat your pet?: " + OtherVet + "<BR/>");
		out.println("Is this a new condition?: " + NewCondition + "<BR/>");
		out.println("Signature: " + signature + "<BR/>");
		out.println("Date: " + dateOfSubmission + "<BR/>");
		out.println("</BODY>");
		out.println("</HTML>");
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
