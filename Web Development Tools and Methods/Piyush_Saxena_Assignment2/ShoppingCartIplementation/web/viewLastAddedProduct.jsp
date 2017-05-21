<%-- 
    Document   : viewLastAddedProduct
    Created on : Feb 1, 2016, 2:14:41 AM
    Author     : Piyush
--%>
<%@page import="java.util.Enumeration"%>
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
        <h2>The following item has been added to your cart successfully:</h2>
        <br/><br/>
        <a href="firstPageBeforeClickingOnProductCategories.html">Return to home page</a>
        <br/>
        <br/>
        <%
            Enumeration x = request.getParameterNames();
            while(x.hasMoreElements()){
                String param = (String)x.nextElement();
                String val = request.getParameter(param);
            %>
            <h4>Check this</h4><jsp:expression>val</jsp:expression>
            <jsp:scriptlet>}</jsp:scriptlet>
    <c:forEach items="${sessionScope.myProductList}" var="item">
        <c:set var="ProductName" value="${item.productName}"/>
    </c:forEach>
    <c:out value="${ProductName}"/>
    <br/>
    <a href="DisplaySelectedProducts.jsp">[View Cart]</a>
    <a href="DisplayProductListAsCheckboxes.jsp?category=Books">[Go to Books page]</a>
    <a href="DisplayProductListAsCheckboxes.jsp?category=Music">[Go to Music page]</a>
    <a href="DisplayProductListAsCheckboxes.jsp?category=Laptop">[Go to Computers page]</a>
    </body>
</html>
