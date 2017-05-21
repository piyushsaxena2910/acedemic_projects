<%-- 
    Document   : index
    Created on : Feb 9, 2016, 12:36:17 AM
    Author     : Piyush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Store</title>
    </head>
    <body>
        <h1>How many books do you want to add?</h1>
        <form action="books.do" method="post">
            <input type="number" name="numberOfBooks" min="1"/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
