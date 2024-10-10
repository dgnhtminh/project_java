<%-- 
    Document   : user
    Created on : Oct 6, 2024, 9:21:27 PM
    Author     : Hacom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User</title>
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/admin.css">
    </head>

    <body>
        <div class="sidebar">
            <%@include file="sider.jsp"%>
        </div>

        <div class="content">
            <h1>Trang User</h1>
            <table border="1px" width="40%">
                <tr>
                    <th>Id_user</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Name</th>
                    <th>Date_of_bird</th>
                    <th>Role</th>
                    <th>Status</th>
                </tr>
                <c:forEach items="${requestScope.data}" var="c">
                    <c:set var="id" value="${c.id_user}"/>
                    <tr>
                        <td>${id}</td>
                        <td>${c.username}</td>
                        <td>${c.password}</td>
                        <td>${c.name}</td>
                        <td>${c.date_of_bird}</td>
                        <td>${c.role}</td>
                        <td>${c.status}</td>
                    </tr>
                </c:forEach>
                <c:if test="${not empty requestScope.data}">
                    <c:forEach items="${requestScope.data}" var="c">
                        <!-- Vòng lặp hiển thị dữ liệu -->
                    </c:forEach>
                </c:if>
                <c:if test="${empty requestScope.data}">
                    <p>Không có dữ liệu để hiển thị</p>
                </c:if>


            </table>
        </div>
    </body>
</html>

