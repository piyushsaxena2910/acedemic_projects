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
  <script src='dwr/engine.js'></script>
<script src='dwr/interface/JavascriptServices.js'></script>
<script>
function displayCategoryTextBoxes(){
			var numberOfCategories = $("#numberOfCategories").val();
			var divToAddTags = $("#categories");
			var hiddenField = $("<input type='hidden' name='numberOfCategoriesHidden' value='"+numberOfCategories+"'></input>")
			var i;
			for(i = 0; i < numberOfCategories; i++){
				var lableForCategoryName = $("<label for='name"+i+"'>Enter Category Name:&nbsp;</label>");
				var textFieldNameForCategoryName = $("<input name='categoryName"+i+"' type='text' id='name"+i+"' required='true'/>");
				var lableForCategoryValue = $("<label for='value"+i+"'>Enter Category Value:&nbsp;</label>");
				var textFieldForCategoryValue = $("<input name='categoryValue"+i+"' type='text' id='value"+i+"' required='true'/></br><br/>");
				divToAddTags.append(lableForCategoryName);
				divToAddTags.append(textFieldNameForCategoryName);
				divToAddTags.append(lableForCategoryValue);
				divToAddTags.append(textFieldForCategoryValue);
				divToAddTags.append(hiddenField);
			}
		}
function displayProducts(applicationName){
	JavascriptServices.getProductsList(applicationName, {
		callback : function(data) {
			var productsSelectBox = $("#productsSelect");
			$("#productsSelect").empty();
			var i;
			for(i = 0; i < data.length; i++){
				var optionToBeAdded = $("<option name='productName' value='"+data[i]+"'>"+data[i]+"</option>");
				productsSelectBox.append(optionToBeAdded);
			}
		}
	});
}
</script>
<title>Edit Product Catalog Page</title>
</head>
<body>
<div class="container">
<h3>Enter Details For The page:</h3>
<br/>
<select id="application" onclick="displayProducts(this.value)">
  <c:forEach items="${applicationList}" var="applicationNameList">
  <option value="${applicationNameList}">${applicationNameList}</option>
  </c:forEach>
  </select>
  <br/>
  <br/>
  <label for="numberOfCategories">Enter Number of Categories:</label>
  <input type="number" id="numberOfCategories" name="numberOfCategoriesNameTag" required="true"/>
  <button type="submit" class="btn btn-default" onclick="displayCategoryTextBoxes()">Submit</button>
  <form:form method="POST" action="editProductCatalogPage.htm" commandName="category" modelAttribute="category">
  <br/><br/>
  <label for="productsSelect">Select The Product:</label>
  <select id="productsSelect" name="productsSelect">
  </select>
  <br/><br/>
  <div id="categories"></div>
  <button type="submit" class="btn btn-default">Submit</button>
</form:form>
<br/>
<a href="editCategoryDisplay.htm">Edit Category Display</a>
<br/><br/>
  <a href="index.htm">Go To Home Page</a><br/>
<br/><br/>
  <a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
</div>
</body>
</html>