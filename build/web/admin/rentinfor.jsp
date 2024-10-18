<%-- 
    Document   : rentinfor
    Created on : Oct 6, 2024, 3:32:48 PM
    Author     : Hacom
--%>

<%@page import="model.Rentinfor"%>
<%@page import="model.Rentinfor"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Rentinfor</title>
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/admin.css">
        <script type="text/javascript">
            function doDelete(id){
                if(confirm("Are you sure to delete a reninfor ?")){
                    window.location="delete-rentinfor?id=" +id;
                }
            }
        </script>
    </head>
    
    <body>
        <div class="sidebar">
            <%@include file="sider.jsp"%>
        </div>

        <div class="content">
            <h1>Trang rentinfor</h1>
            <h3><a href="create-rentinfor">Add new a rentinfor</a></h3>
            <table border="1px" width="90%">
                <tr>
                    <th>Id</th>
                    <th>Customer_name</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Customer note</th>
                    <th>Pick up date</th>
                    <th>Pick off date</th>
                    <th>Pick up location</th>
                    <th>Pick off location</th>
                    <th>Id_user</th>
                    <th>Time sent</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                <% List<Rentinfor> rentinfors = (List<Rentinfor>)request.getAttribute("data"); %>
                <% for(Rentinfor x : rentinfors){
                %>
                <tr>
                    <td><%= x.getRent_id()%></td>
                    <td><%= x.getCustomer_name() %></td>
                    <td><%= x.getPhone()%></td>
                    <td><%= x.getEmail()%></td>
                    <td><%= x.getCustomer_note()%></td>
                    <td><%= x.getPick_up_date()%></td>
                    <td><%= x.getPick_off_date()%></td>
                    <td><%= x.getPick_up_location()%></td>
                    <td><%= x.getPick_off_location()%></td>
                    <td><%= x.getId_user()%></td> 
                    <td><%= x.getTime_sent()%></td>
                    <td><%= x.getStatus()%></td> 
                    <tD>
                        <a href="update-rentinfor?id=<%= x.getRent_id()%>">Update</a>&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#" onclick="doDelete(<%= x.getRent_id()%>)">Delete</a>
                    </tD>
                </tr>
                <%
                   }
                %>
            </table>
        </div>
    </body>
</html>