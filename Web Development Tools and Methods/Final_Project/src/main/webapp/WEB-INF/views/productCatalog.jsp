<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Catalog</title>
<style>
#header {
    background-color:;
    float:left;
    width: 100%;
    height: 15%;
    color:black;
    text-align:center;
    padding:5px;
    border:2px solid black;	 
}
#aside {
    background-color:;
    float:left;
    width: 30%;
    height: 1000px;
    padding:5px;	
    border:2px solid black;	 
}
#section {
    background-color:;
    float:right;
    width: 65%;
    height: 100%;
    padding:5px;	
    border:2px solid black;	 	      
}
div.container{
	height: 1000px;
	width: 1000px;
	border:2px solid black;	
}
#everyProduct {
	float:right;
	width: 65%;
    height: 100%;
    border:1px solid black;	
}
</style>
</head>
<body>
<form method="POST" action="runApplication.htm">
<div class="container">
<div id="header">
<h2>Product Catalog</h2>
</div>
<div id="aside">
<c:forEach items="${sessionScope.categories}" var="category" varStatus="loop">
  <label>&nbsp;${category}</label>
  <img src='${category.categoryLogo}' width="60" height="60"/>
  <br/>
  <label>&nbsp;${category.categoryValue}</label>
  <img src='${category.valueLogo}' width="60" height="60"/>
  <input type="checkbox" name=${category.categoryValue}/>
  <br/><br/><br/>
  </c:forEach>
</div>

<div class="products">
<c:forEach items="${sessionScope.products}" var="products" varStatus="loop">
<div id="everyProduct">
<label>Product Name : &nbsp;${products.productName}</label><br/>
<label>Product Price : &nbsp;${products.productPrice}</label><br/>
Select :&nbsp<input type="radio" name="productSelected" value="${products.productName}" required="true"></input>
</div>
<br/>
<br/>
</c:forEach>
</div>

</div>
<button type="submit" class="btn btn-default">Submit</button>
</form>
<br/><br/>
  <a href="logout.htm">Logout</a>
</body>
</html>