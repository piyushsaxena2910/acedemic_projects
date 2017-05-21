<%-- 
    Document   : addBooks
    Created on : Feb 9, 2016, 1:29:19 AM
    Author     : Piyush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Books Details</title>
    </head>
    <body>
        <form action="addedSuccessfully.htm" method="post">
        <table>
            <tr>
                <th>ISBN</th>
                <th>Book Title</th>
                <th>Authors</th>
                <th>Price</th>
            </tr>
            <c:forEach var="i" begin="1" end="${sessionScope.numberOfBooks}">
                <tr>
                    <td><input type="text" name='<c:out value="${i}"></c:out>'/></td>
                    <td><input type="text" name='<c:out value="${i}"></c:out>'/></td>
                    <td><input type="text" name='<c:out value="${i}"></c:out>'/></td>
                    <td><input type="text" name='<c:out value="${i}"></c:out>'/></td>
                </tr>
            </c:forEach>
        </table>
            <input type="hidden" name="number" value="${sessionScope.numberBooks}"/>
            <input type="hidden" name="numberOfBook" value="number"/>
        <input type="submit" value="submit"/>
        </form>
    </body>
</html>
