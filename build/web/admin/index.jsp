<%-- 
    Document   : index
    Created on : Oct 6, 2024, 9:21:14 PM
    Author     : Hacom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Admin</title>
        <link rel="stylesheet" href="<%= request.getContextPath() %>/css/admin.css">
    </head>
    
    <body>
        <div class="sidebar">
            <%@include file="sider.jsp"%>
        </div>

        <div class="content">
            <h1>Trang Admin</h1>
<!--            <table border="1px" width="40%">
                <tr>
                    <th>ID</th>
                    <th>STT</th>
                    <th>Name</th>
                </tr>
            </table>-->
        </div>
    </body>
</html>

