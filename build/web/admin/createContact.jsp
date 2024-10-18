<%-- 
    Document   : createContact
    Created on : 16-10-2024, 23:22:51
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create contact</title>
    </head>
    <body>
        <h1>Add new a contact</h1>
        <form action="create-contact" method="post">
            Username:<input type="text" name="username" required/><br/>
            Email:<input type="text" name="email" required/><br/>
            Subject:<input type="text" name="subject" required/><br/>
            Message:<input type="text" name="message" required/><br/>
            Status:<input type="radio" name="status" value="0" checked/>0
                   <input type="radio" name="status" value="1"/>1<br/>
            Time sent:<input type="date" name="time_sent" required/><br/>
            <input type="submit" value="Create"/>
        </form>
    </body>
</html>
