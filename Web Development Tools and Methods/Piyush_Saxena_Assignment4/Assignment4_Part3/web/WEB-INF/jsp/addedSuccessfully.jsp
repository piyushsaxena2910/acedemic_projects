<%-- 
    Document   : addedSuccessfully
    Created on : Feb 9, 2016, 2:55:20 PM
    Author     : Piyush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books Added</title>
    </head>
    <body>
        <h3><c:out value="${sessionScope.result}"></c:out>&nbsp;books added successfully</h3><br/><br/>
        
    </body>
</html>
