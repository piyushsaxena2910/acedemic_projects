<%-- 
    Document   : DisplaySelectedProducts
    Created on : Jan 31, 2016, 9:02:18 PM
    Author     : Piyush
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.edu.neu.Items.Products"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Items currently in your Cart:</h2>
        <br/><br/>
        <a href="firstPageBeforeClickingOnProductCategories.html">Return to home page</a>
        <br/>
        <br/>
        <c:set var="total" value="${0}"/>
        <c:set var="counter" value="${1}"/>
    <c:forEach items="${sessionScope.myProductList}" var="item">
        <c:out value="${counter}"/>.&nbsp;
        Product: ${item.productName}
        <a href='removeProduct.htm?action=removeProduct&productName=${item.productName}'>Remove Product</a>
        <br/>
        <c:set var="total" value="${total+item.price}"/>
        <c:set var="counter" value="${counter+1}"/>
    </c:forEach>
        <hr>
        <p>Total Amount : </p>
    <c:out value="${total}"/>
    <br/>
    <a href="DisplayProductListAsCheckboxes.jsp?category=Books">[Go to Books page]</a>
    <a href="DisplayProductListAsCheckboxes.jsp?category=Music">[Go to Music page]</a>
    <a href="DisplayProductListAsCheckboxes.jsp?category=Laptop">[Go to Computers page]</a>
    </body>
</html>
