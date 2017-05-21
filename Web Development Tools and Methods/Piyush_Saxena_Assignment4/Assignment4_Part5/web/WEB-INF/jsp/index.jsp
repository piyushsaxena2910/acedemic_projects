<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="name" uri="/WEB-INF/jsp/tlds/columnnamestag_library.tld"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <c:choose>
        <c:when test="${sessionScope.pageNode == null}">
        <form action="viewRecords.htm" method="post">
            <p>Enter the CSV file name</p></br>
            <input type="text" name="fileName" required/>
            <input type="hidden" name="action" value="viewAllRecords"/>
            <input type="submit" value="Submit"/>
        </form>
        </c:when>
        <c:when test="${sessionScope.pageNode == 1}">
            <name:ColumnNames fileName="${param.fileName}"> </name:ColumnNames>
        
        </c:when>
        <c:when test="${sessionScope.pageNode == 2}">
            <h2>"${sessionScope.numberOfRowsAdded}" rows have been added!</h2>
        </c:when>
        </c:choose>
    </body>
</html>

