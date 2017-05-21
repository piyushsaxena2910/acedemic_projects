<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<div class="container">
<h3>Welcome to your workspace ${userFound.userName}!</h3>
<br/>
<P>Select the action you want to perform:</P>
<br/>
<form method="POST" action="runApplication.htm">
  <div class="form-group">
  <select id="application" name="application">
  <c:forEach items="${applicationList}" var="applicationNameList">
  <option value="${applicationNameList}">${applicationNameList}</option>
  </c:forEach>
  </select>
  <button type="submit" class="btn btn-default">Submit</button>
  </div>
  <br/>
  </form>
  <a href="logout.htm">Logout</a>
</div>
</body>
</html>