<%-- 
    Document   : createUser
    Created on : 10-10-2024, 22:09:09
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add new a user</h1>
        <form action="create-user" method="post">
<!--            Id_user:<input type="number" name="id"/><br/>-->
            Username:<input type="text" name="username" required/><br/>
            Password:<input type="text" name="password" required/><br/>
            Name:<input type="text" name="name" required/><br/>
            Date_of_bird:<input type="date" name="date_of_bird" required/><br/>
            Role:<input type="radio" name="role" value="0" checked/>0
                   <input type="radio" name="role" value="1"/>1<br/>
            Status:<input type="radio" name="status" value="0" checked/>0
                   <input type="radio" name="status" value="1"/>1<br/>
            <input type="submit" value="Create"/>
        </form>
    </body>
</html>
