<%-- 
    Document   : viewnote
    Created on : 19-Sep-2022, 1:16:23 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>View Note</h1>
        <form>
            <p>
                <label> Title:
                <input type="text">
            </label>
            </p>
            <p>
                <label for="contents">Contents:
                <textarea id="contents"></textarea>
                </label>
            </p>
            <p>
                <button type="submit">
                    Submit
                </button>
            </p>
    </body>
</html>
