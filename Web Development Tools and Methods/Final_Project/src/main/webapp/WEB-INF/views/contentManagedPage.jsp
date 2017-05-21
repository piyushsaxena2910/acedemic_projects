<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Content Managed Application</title>
<style>
header {
    background-color:;
    color:black;
    text-align:center;
    padding:5px;	 
}
nav {
    line-height:100px;
    background-color:#eeeeee;
    height:300px;
    width:100px;
    float:right;
    padding:5px;	      
}
section {
    width:350px;
    float:left;
    padding:10px;	 	 
}
footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px;	 	 
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
<header><h1>${page.header}</h1></header>
<nav><a href="s">${page.navigator}</a></nav>
<article>${page.article}
<section>${page.section}</section>
</article>
<aside>${page.aside}</aside>
<div id="everyProduct">
<p>Product Selected:</p>
<label>Product Name : &nbsp;${sessionScope.product.productName}</label><br/>
<label>Product Price : &nbsp;${sessionScope.product.productPrice}</label><br/>
</div>
<footer>${page.footer}</footer>
<button type="submit" class="btn btn-default">Submit</button>
</div>
</form>
</body>
</html>