<%-- 
    Document   : login
    Created on : Oct 6, 2024, 3:25:59 PM
    Author     : Hacom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Đăng nhập</h1>
        <%
            if(request.getAttribute("error") != null){
                String er = (String)request.getAttribute("error");
        %>
        <h3 style="color: red"><%= er %></h3>
        <%
            }
        %>
        <form action="${pageContext.request.contextPath}/admin-login" method="post">
            Username:<input type="text" name="user"/><br/>
            Password:<input type="password" name="pass"/><br/>
            <input type="submit" value="SUBMIT"/><br/>
        </form>
    </body>
</html>
