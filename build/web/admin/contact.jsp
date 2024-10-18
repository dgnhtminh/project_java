<%-- 
    Document   : contact
    Created on : Oct 6, 2024, 3:31:45 PM
    Author     : Hacom
--%>

<%@page import="model.Contact"%>
<%@page import="model.Contact"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Contact</title>
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/admin.css">
        <script type="text/javascript">
            function doDelete(id){
                if(confirm("Are you sure to delete a contact ?")){
                    window.location="delete-contact?id=" +id;
                }
            }
        </script>
    </head>
    
    <body>
        <div class="sidebar">
            <%@include file="sider.jsp"%>
        </div>

        <div class="content">
            <h1>Trang contact</h1>
            <h3><a href="create-contact">Add new a contact</a></h3>
            <table border="1px" width="90%">
                <tr>
                    <th>Id</th>
                    <th>Username</th>
                    <th>Email</th>
                    <th>Subject</th>
                    <th>Message</th>
                    <th>Status</th>
                    <th>Time sent</th>
                    <th>Action</th>
                </tr>
                <% List<Contact> contacts = (List<Contact>)request.getAttribute("data"); %>
                <% for(Contact x : contacts){
                %>
                <tr>
                    <td><%= x.getId() %></td>
                    <td><%= x.getUsername() %></td>
                    <td><%= x.getEmail()%></td>
                    <td><%= x.getMessage()%></td>
                    <td><%= x.getSubject()%></td>
                    <td><%= x.getStatus() %></td>
                    <td><%= x.getTime_sent()%></td>
                    <tD>
                        <a href="update-contact?id=<%= x.getId() %>">Update</a>&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#" onclick="doDelete(<%= x.getId() %>)">Delete</a>
                    </tD>
                </tr>
                <%
                   }
                %>
            </table>
        </div>
    </body>
</html>

