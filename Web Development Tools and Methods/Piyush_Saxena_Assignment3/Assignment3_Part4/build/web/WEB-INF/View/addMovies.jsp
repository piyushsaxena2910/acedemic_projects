<%-- 
    Document   : addMovies
    Created on : Feb 8, 2016, 2:16:45 AM
    Author     : Piyush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Movie</title>
    </head>
    <body>
        <h1>Please enter the details below:</h1>
        <form action="movieAddedSuccessfully.htm" method="post">
            Movie Title:<input type="text" name="title" required/><br/><br/>
            Lead Actor:<input type="text" name="actor" required/><br/><br/>
            Lead Actress:<input type="text" name="actress" required/><br/><br/>
            Genre:<input type="text" name="genre" required/><br/><br/>
            Year:<input type="text" name="year" required/><br/><br/>
            <input type="hidden" name="hidden" value="add"/>
            <input type="submit" value="Add Movies"/>
        </form>
    </body>
</html>
