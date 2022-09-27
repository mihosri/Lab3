<%-- 
    Document   : editnote
    Created on : 19-Sep-2022, 1:16:35 PM
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
      <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form>
            <p>
                <label> 
                    Title:
                    <input type="text">
                </label> 
            </p>
            
            <p>
                <label for="contents">Contents:</label>
                <textarea id="contents"> </textarea>
            </p>
            
            <button type="submit">Save</button>
            
        </form>
            
    </body>
</html>
