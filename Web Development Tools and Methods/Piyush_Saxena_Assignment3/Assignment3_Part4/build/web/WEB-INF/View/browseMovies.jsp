<%-- 
    Document   : browseMovies
    Created on : Feb 8, 2016, 2:16:32 AM
    Author     : Piyush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Searching Movies:</h1>
        <form action="searchResults.htm" method="post">
            Keyword:<input type="text" name="keyword" required/><br/><br/>
            <input type="radio" name="searchBy" value="title"/>Search By Title<br/><br/>
            <input type="radio" name="searchBy" value="actor"/>Search By Actor<br/><br/>
            <input type="radio" name="searchBy" value="actress"/>Search By Actress<br/><br/>
            <input type="hidden" name="hidden" value="browse"/>
            <input type="submit" value="Search Movies"/>
        </form>
    </body>
</html>
