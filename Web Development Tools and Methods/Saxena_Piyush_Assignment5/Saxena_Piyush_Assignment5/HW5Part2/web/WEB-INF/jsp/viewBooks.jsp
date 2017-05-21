<%-- 
    Document   : viewBooks
    Created on : Feb 9, 2016, 1:45:22 AM
    Author     : shrut
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styleView.css"/> 
        <title>View Books</title>
    </head>
    <body>
        <h1>You have added <c:out value="${sessionScope.value}"></c:out> entries to the database!</h1>
        
        
    </body>
</html>
