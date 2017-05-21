<%-- 
    Document   : searchResults
    Created on : Feb 8, 2016, 5:51:02 PM
    Author     : Piyush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
    </head>
    <body>
        <h3>You searched for <c:out value="${sessionScope.keyword}"></c:out></h3><br/><br/>
        <p><u>Here are the search results</u></p><br/><br/>
        <c:forEach var="movie" items="${sessionScope.movieResultList}">
            <b>Movie Title:</b><c:out value="${movie.title}"></c:out><br/><br/>
            <b>Lead Actor:</b><c:out value="${movie.actor}"></c:out><br/><br/>
            <b>Lead Actress:</b><c:out value="${movie.actress}"></c:out><br/><br/>
            <b>Genre:</b><c:out value="${movie.genre}"></c:out><br/><br/>
            <b>Year:</b><c:out value="${movie.year}"></c:out><br/><br/>
            <hr><br/><br/>
        </c:forEach>
            <a href="index.jsp">Click here to go back to the main page</a>
    </body>
</html>
