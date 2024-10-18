<%-- 
    Document   : updateRentinfor
    Created on : 17-10-2024, 23:48:44
    Author     : pc
--%>

<%@page import="model.Rentinfor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update rentinfor</title>
    </head>
    <body>
        <h1>Update a contact</h1>
        <% Rentinfor u = (Rentinfor)request.getAttribute("rentinfor"); %>
        <form action="update-rentinfor" method="post">   
            Customer_name:<input type="text" name="customer_name" value="<%= u.getRent_id()%>"/><br/>
            Phone:<input type="text" name="phone" value="<%= u.getPhone()%>"/><br/>
            Email:<input type="text" name="email" value="<%= u.getEmail()%>"/><br/>
            Customer_note:<input type="text" name="customer_note" value="<%= u.getCustomer_note()%>"/><br/>
            Pick_up_date:<input type="date" name="pick_up_date" value="<%= u.getPick_up_date()%>"/><br/>
            Pick_off_date:<input type="date" name="pick_off_date" value="<%= u.getPick_off_date()%>"/><br/>
            Pick_up_location:<input type="text" name="pick_up_location" value="<%= u.getPick_up_location()%>"/><br/>
            Pick_off_location:<input type="text" name="pick_off_location" value="<%= u.getPick_off_location()%>"/><br/>
            Id_user:<input type="text" name="id_user" value="<%= u.getId_user()%>"/><br/>
            Time_sent:<input type="date" name="time_sent" value="<%= u.getTime_sent()%>"/><br/>
            Status:<input type="text" name="status" value="<%= u.getStatus()%>"/><br/>
            <input type="submit" value="Update"/>
        </form>
    </body>
</html>
