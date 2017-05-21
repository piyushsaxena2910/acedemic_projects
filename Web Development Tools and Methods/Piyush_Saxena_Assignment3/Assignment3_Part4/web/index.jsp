<%-- 
    Document   : index
    Created on : Feb 6, 2016, 9:44:15 PM
    Author     : Piyush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Movies Store</title>
    </head>
    <body>
        <h1>Welcome to our Movies Store</h1><br/>
        <h3>Please enter your selection below</h3><br/>
        <form action="movies.do" method="post">
            <select name="choice">
                <option value="Browse Movies">Browse Movies</option>
                <option value="Add new movies in database">Add new movies in database</option>
            </select>
            <br/>
            <input type="submit" value="Send"/>
        </form>
    </body>
</html>
