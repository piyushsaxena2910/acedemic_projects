<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Store</title>
    </head>
    <body>
        <h1>How many books do you want to add?</h1>
        <form action="books.htm" method="post">
            <input type="text" name="numberOfBooks"/>
            <input type="hidden" value="numberOfBook" name="numberOfBook"/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
