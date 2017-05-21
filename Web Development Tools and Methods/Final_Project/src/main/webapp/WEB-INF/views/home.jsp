<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<div class="container">
<h3>Welcome to your workspace ${userFound.userName}!</h3>
<br/>
<P>Select the action you want to perform:</P>
<br/>
<a href="newApplicationLink.htm">Add an Application</a><br/>
<a href="addAPageLink.htm">Add a Page</a><br/>
<a href="ManageFlow.htm">Manage the Flow of your Website</a><br/>
<a href="EditPage.htm">Edit a Page</a><br/>
<a href="AddOrViewProducts.htm">Add Products Page</a><br/>
<a href="EditProductCatalogPage.htm">Edit the Product Catalog Page</a><br/>
<a href="AddAUser.htm">Add A New Tester</a><br/>
<br/><br/>
<a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
</div>
</body>
</html>
