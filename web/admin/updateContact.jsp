<%-- 
    Document   : updateContact
    Created on : 16-10-2024, 23:31:28
    Author     : pc
--%>

<%@page import="model.Contact"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update contact</title>
    </head>
    <body>
        <h1>Update a contact</h1>
        <% Contact u = (Contact)request.getAttribute("contact"); %>
        <form action="update-user" method="post">   
            Id:<input type="number" name="id" readonly value="<%= u.getId() %>" /><br/>
            Username:<input type="text" name="username" value="<%= u.getUsername() %>"/><br/>
            Email:<input type="text" name="email" value="<%= u.getEmail()%>"/><br/>
            Subject:<input type="text" name="subject" value="<%= u.getSubject()%>"/><br/>
            Message:<input type="text" name="message" value="<%= u.getMessage()%>"/><br/>
            Status:<input type="number" name="status" min="0" max="1" step="1" value="<%= u.getStatus() %>"/><br/>
            Time sent:<input type="date" name="time_sent" value="<%= u.getTime_sent()%>"/><br/>
            <input type="submit" value="Update"/>
        </form>
    </body>
</html>
