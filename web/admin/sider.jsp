<%-- 
    Document   : sider
    Created on : 08-10-2024, 23:06:12
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
        <h2><a href="index.jsp">ADMIN</a></h2>
        <ul>
            <li><a href="home.jsp">Quản lý</a></li>
            <li><a href="user.jsp">User</a></li>
            <li><a href="contact.jsp">Contact</a></li>
            <li><a href="rentinfor.jsp">Rentinfor</a></li>
            <li><a href="car.jsp">Car</a></li>
        </ul>
        <div class="logout">
            <a href="${pageContext.request.contextPath}/admin-login" 
               style="text-align: center; color: white; display: block;"
               >Đăng xuất</a>
        </div>
    </body>
</html>
