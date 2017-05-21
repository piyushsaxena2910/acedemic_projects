<%-- 
    Document   : index
    Created on : Feb 9, 2016, 1:06:21 AM
    Author     : shrut
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css"/> 
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <title>Books Database</title>
    </head>
    <body>
        <h1>How many books do you want to add to the database?</h1>
        <form action="addToDB.htm">
        <input type="number" name="quantity" min="1" required/>
        <input type="submit" value="Add" name="submit"/>
        <input type="hidden" value="hidden" name="hidden"/>
        </form>
    </body>
</html>
