<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Add A Page</title>
</head>
<body>
<div class="container">
<h3>Enter Details For The page:</h3>
<br/>
<form:form method="POST" action="addAPage.htm" commandName="page" modelAttribute="page">
  <div class="form-group">
  <form:select path="application" id="application" items="${sessionScope.applicationList}" itemValue="applicationName" itemLabel="applicationName"/>
  <form:errors path="application"/>
  </div>
  <br/>
  <div class="form-group">
    <label for="pageName">Page Name:</label>
    <form:input type="text" class="form-control" id="pageName" path="pageName"/><form:errors path="pageName"/>
  </div>
  <div class="form-group">
    <label for="header">Header:</label>
    <form:input type="text" class="form-control" id="header" path="header"/><form:errors path="header"/>
  </div>
  <div class="form-group">
    <label for="article">Article:</label>
    <form:input type="text" class="form-control" id="article" path="article"/><form:errors path="article"/>
  </div>
  <div class="form-group">
    <label for="aside">Aside:</label>
    <form:input type="text" class="form-control" id="aside" path="aside"/><form:errors path="aside"/>
  </div>
  <div class="form-group">
    <label for="navigator">Navigator:</label>
    <form:input type="text" class="form-control" id="navigator" path="navigator"/><form:errors path="navigator"/>
  </div>
  <div class="form-group">
    <label for="section">Section:</label>
    <form:input type="text" class="form-control" id="section" path="section"/><form:errors path="section"/>
  </div>
  <div class="form-group">
    <label for="footer">Footer:</label>
    <form:input type="text" class="form-control" id="footer" path="footer"/><form:errors path="footer"/>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form:form>
<br/>
  <a href="index.htm">Go To Home Page</a><br/>
<br/><br/>
  <a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
</div>
</body>
</html>