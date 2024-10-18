<%-- 
    Document   : updateUser
    Created on : 11-10-2024, 10:25:51
    Author     : pc
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update user</title>
    </head>
    <body>
        <h1>Update a user</h1>
        <% User u = (User)request.getAttribute("user"); %>
        <form action="update-user" method="post">   
            Id_user:<input type="number" name="id" readonly value="<%= u.getId_user() %>" /><br/>
            Username:<input type="text" name="username" value="<%= u.getUsername() %>"/><br/>
            Password:<input type="text" name="password" value="<%= u.getPassword() %>"/><br/>
            Name:<input type="text" name="name" value="<%= u.getName() %>"/><br/>
            Date_of_bird:<input type="date" name="date_of_bird" value="<%= u.getDate() %>"/><br/>
            Role:<input type="number" name="role" min="0" max="1" step="1" value="<%= u.getRole() %>"/><br/>
            Status:<input type="number" name="status" min="0" max="1" step="1" value="<%= u.getStatus() %>"/><br/>
            <input type="submit" value="Update"/>
        </form>
    </body>
</html>
