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
<title>Add An Application</title>
<style>
.logoutLblPos{

   position:fixed;
   right:10px;
   top:5px;
}
</style>
</head>
<body>

<div class="container">
<h3>Enter Details For The page:</h3>
<form:form  method="POST" action="addApplication.htm" commandName="application">
  <div class="form-group">
    <label for="applicationName">Application Name:</label>
    <form:input type="text" class="form-control" id="applicationName" path="applicationName"/><form:errors path="applicationName"/>
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