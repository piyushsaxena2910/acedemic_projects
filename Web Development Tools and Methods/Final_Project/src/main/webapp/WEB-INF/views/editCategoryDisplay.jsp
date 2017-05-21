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
<title>Edit Category Display</title>
</head>
<body>
<div id="category">
<form:form method="POST" action="addCategoryNameValueLogo.htm" enctype="multipart/form-data" modelAttribute="uploadedFiles">
  <p><h3>Category Names List</h3>
  <c:forEach items="${categoryNameAndValue[0]}" var="categoryNameList" varStatus="loop">
  <label>Category Name :&nbsp;${categoryNameList}</label>
  <br/>
  <label for="categoryName${categoryNameList}">Enter image URL :&nbsp;</label>
  <input type="file" name="files[${loop.index}]" id="categoryName${categoryNameList}"/>
  <input type="hidden" name="categoryName${categoryNameList}${loop.index}"/>
  <br/>
  </c:forEach>
  </p>
  <p><h3>Category Values List</h3>
  <c:forEach items="${categoryNameAndValue[1]}" var="categoryValueList" varStatus="loop">
  <label>Category Value :&nbsp;${categoryValueList}</label>
  <br>
  <label for="categoryValue${categoryValueList}">Upload Image :&nbsp;</label>
  <input type="file" name="files[${loop.index+categoryNameAndValue[0].size()}]" id="categoryValue${categoryValueList}"/>
  <input type="hidden" name="categoryValue${categoryValueList}${loop.index+categoryNameAndValue[0].size()}"/>
  </p>
  </c:forEach>
  <button type="submit" class="btn btn-default">Submit</button>  
</form:form>
<br/>
  <a href="index.htm">Go To Home Page</a><br/>
<br/><br/>
  <a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
</div>
  <br/>
  <br/>
</body>
</html>