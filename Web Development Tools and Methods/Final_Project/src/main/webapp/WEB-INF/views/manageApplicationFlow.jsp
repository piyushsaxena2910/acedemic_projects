<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
  <script src='dwr/engine.js'></script>
<script src='dwr/interface/JavascriptServices.js'></script>

<script>
function displayPages(applicationName){
	JavascriptServices.getPageList(applicationName, {
		callback : function(data) {
			var table = $("#pagesTableBody");
			$("#pagesTableBody tr").remove(); 
			var i;
			for(i = 0; i < data.length; i++){
				var tr = $("<tr id=row"+i+">");
				var td = $("<td>");
				td.append(data[i]);
			    tr.append(td);
			    
			    var td = $("<td>");
			    td.append("<input type='number' path='flow' min='2' class='form-group' name='flow' id='flow"+data[i]+"' required/>");
			    tr.append(td);
				table.append(tr);
			}
			var tr = $("<tr>");
			var td = $("<td>");
			td.append("Product Catalog");
		    tr.append(td);
		    
		    var td = $("<td>");
		    td.append("<input type='number' path='flow' class='form-group' name='productCatalogID' value='1' id='productCatalogID' readonly='true'/>");
		    tr.append(td);
			table.append(tr);
		}
	});
}
</script>

<title>Manage Website Flow</title>
</head>
<body>
<div class="container"><br/><br/>
<h3>Enter The Sequence For The page:</h3>
<form:form method="POST" action="manageApplicationFlow.htm" commandName="application" modelAttribute="application">
  <div class="form-group">
  <form:select path="applicationName" id="applicationName" items="${applicationList}" itemValue="applicationName" itemLabel="applicationName"
  			   onclick="displayPages(this.value)" name="applicationname"/>
  <form:errors path="applicationName"/>
  </div>
  <br/>
<table id="pagesTable" class="table table-striped">
	<tr>
	<th>Page</th>
	<th>Sequence</th>
	</tr>
	<tbody id="pagesTableBody">
	</tbody>
</table>
<br/><br/>
<button type="submit" class="btn btn-default">Submit</button>
</form:form>
<br/>
  <a href="index.htm">Go To Home Page</a><br/>
<br/><br/>
  <a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
</div>
</body>
</html>