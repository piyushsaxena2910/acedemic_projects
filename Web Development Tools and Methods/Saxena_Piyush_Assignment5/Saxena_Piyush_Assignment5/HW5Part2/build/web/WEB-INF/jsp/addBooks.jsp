<%-- 
    Document   : addBooks
    Created on : Feb 9, 2016, 1:28:12 AM
    Author     : shrut
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styleAdd.css"/> 
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <title>Add Books</title>
    </head>
    <body>
        
        <form action="addToDB.htm">
            <table class="table table-striped">
                <tr>
                    <th>ISBN</th>
                    <th>Book Title</th>
                    <th>Author</th>
                    <th>Price</th>
                </tr>
                
        <c:forEach var="i" begin="1" end="${sessionScope.val}">
            <tr>
            <td><p><input type="text" name='isbn<c:out value="${i}"></c:out>' required></p></td>
            <td><p><input type="text" name='title<c:out value="${i}"></c:out>' required></p></td>
            <td><p><input type="text" name='author<c:out value="${i}"></c:out>' required></p></td>
            <td><p><input type="text" name='price<c:out value="${i}"></c:out>' required></p></td>
            <input type="hidden" name="hidden" value="hidden2"/>
            </tr>
        </c:forEach>  
            
            </table>
            <input type="submit" name="submit" value="add"/>
            <input type="hidden" name="valItr" value="${sessionScope.val}"/>
        </form>
        
    </body>
</html>
