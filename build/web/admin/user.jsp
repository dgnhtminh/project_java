<%-- 
    Document   : user
    Created on : Oct 6, 2024, 9:21:27 PM
    Author     : Hacom
--%>

<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User</title>
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/admin.css">
        <script type="text/javascript">
            function doDelete(id){
                if(confirm("Are you sure to delete a user ?")){
                    window.location="delete-user?id=" +id;
                }
            }
        </script>
    </head>

    <body>
        <div class="sidebar">
            <%@include file="sider.jsp"%>
        </div>

        <div class="content">
            <h1>Trang User</h1>
            <h3><a href="create-user">Add new a user</a></h3>
            <table border="1px" width="90%">
                <tr>
                    <th>Id_user</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Name</th>
                    <th>Date_of_bird</th>
                    <th>Role</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                <% List<User> users = (List<User>)request.getAttribute("data"); %>
                <% for(User x : users){
                %>
                <tr>
                    <td><%= x.getId_user() %></td>
                    <td><%= x.getUsername() %></td>
                    <td><%= x.getPassword() %></td>
                    <td><%= x.getName() %></td>
                    <td><%= x.getDate() %></td>
                    <td><%= x.getRole() %></td>
                    <td><%= x.getStatus() %></td>
                    <tD>
                        <a href="update-user?id=<%= x.getId_user() %>">Update</a>&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#" onclick="doDelete(<%= x.getId_user() %>)">Delete</a>
                    </tD>
                </tr>
                <%
                   }
                %>
            </table>
        </div>
    </body>
</html>

