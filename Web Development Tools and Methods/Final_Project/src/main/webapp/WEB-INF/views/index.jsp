<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to my Content Management website</title>
</head>
<body>
<div class="container">
  <h3>Login to the CMS tool!</h3>
  <h4>${userNotFound}</h4>
  <form:form method="POST" action="login.htm" commandName="user" modelAttribute="user">
  <div class="form-group">
    <label for="userName">User Name:</label>
    <form:input type="text" class="form-control" id="userName" path="userName"/><form:errors path="userName"/>
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <form:input type="password" class="form-control" id="password" path="password"/><form:errors path="password"/>
  </div>
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form:form>
</div>
</body>
</html>