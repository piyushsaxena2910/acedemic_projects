<%-- 
    Document   : DisplayProductListAsCheckboxes
    Created on : Feb 2, 2016, 1:25:25 AM
    Author     : Piyush
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.edu.neu.Items.Products"%>
<%@page import="com.edu.neu.Items.InitializeProducts"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String categoryToDisplay = request.getParameter("category");
            %>
            <h2>Shop For&nbsp;:&nbsp;<jsp:expression>categoryToDisplay</jsp:expression></h2>
        <hr>
        <br/><br/>
        <form action="AddToCart" method="get">
        <%
           String categoryReceived = request.getParameter("category");
           List<Products> productList = new ArrayList<Products>();
           InitializeProducts ip = new InitializeProducts();
           productList = ip.getAvailableProducts();
           int i = 0;
           for(Products product : productList){
               if(product.getCategory().equals(categoryReceived)){
                   ++i;
               }
           }
           String[] productNames = new String[i];
           int j = 0;
           for(Products product : productList)
           {
               if(product.getCategory().equals(categoryReceived))
               {
                   productNames[j] = product.getProductName();
        %>
        <input type="checkbox" name="product" value="<jsp:expression>productNames[j]</jsp:expression>"/><jsp:expression>productNames[j]</jsp:expression>
        <br/>
        <jsp:scriptlet>j++; }}</jsp:scriptlet>
        <input type="submit" value="Add to cart">
        </form>
    </body>
</html>
