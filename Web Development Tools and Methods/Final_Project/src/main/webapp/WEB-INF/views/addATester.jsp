<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add A Tester</title>
</head>
<body>
<div class="container">
<h3>Enter Details For The Tester:</h3>
<form:form  method="POST" action="addATesterRole.htm" commandName="user">
  <div class="form-group">
    <label for="userName">Tester Name:</label>
    <form:input type="text" class="form-control" id="userName" path="userName"/><form:errors path="userName"/>
  </div>
  <div class="form-group">
    <label for="password">Password:</label>
    <form:input type="text" class="form-control" id="password" path="password"/><form:errors path="password"/>
  </div>
  <div class="form-group">
    <label for="role">Role:</label>
    <form:input type="text" class="form-control" id="role" path="role" value="Tester" readonly="true"/><form:errors path="role"/>
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