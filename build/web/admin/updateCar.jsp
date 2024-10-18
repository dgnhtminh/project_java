<%-- 
    Document   : updateCar
    Created on : 16-10-2024, 21:37:29
    Author     : pc
--%>

<%@page import="model.Car"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update car</title>
    </head>
    <body>
        <h1>Update a car</h1>
        <% Car u = (Car)request.getAttribute("car"); %>
        <form action="update-car" method="post">   
            Id_car:<input type="number" name="id" readonly value="<%= u.getId_car() %>" /><br/>
            Car name:<input type="text" name="carname" value="<%= u.getCar_name()%>"/><br/>
            Seats:<input type="text" name="seats" value="<%= u.getSeats()%>"/><br/>
            Fuel:<input type="text" name="fuel" value="<%= u.getFuel()%>"/><br/>
            Transmission:<input type="text" name="transmission" value="<%= u.getTransmission() %>"/><br/>
            Luggage<input type="text" name="luggage" value="<%= u.getLuggage()%>"/><br/>
            Img:<input type="text" name="img" value="<%= u.getImg()%>"/><br/>
            Description:<input type="text" name="description" value="<%= u.getDescription()%>"/><br/>
            Rate:<input type="text" name="rate" value="<%= u.getRate()%>"/><br/>
            Status:<input type="text" name="status" value="<%= u.getStatus()%>"/><br/>
            Color:<input type="text" name="color" value="<%= u.getColor()%>"/><br/>
            Price:<input type="text" name="price" value="<%= u.getPrice()%>"/><br/>
            Year of manufacture:<input type="text" name="year_of_manufacture" value="<%= u.getYear_of_manufacture()%>"/><br/>
            Current address:<input type="text" name="current_address" value="<%= u.getCurrent_address()%>"/><br/>
            Car_type_id:<input type="text" name="car_type_id" value="<%= u.getCar_type_id()%>"/><br/>
            Car_brand_id:<input type="text" name="car_brand_id" value="<%= u.getCar_brand_id()%>"/><br/>
            Rent_id:<input type="text" name="rent_id" value="<%= u.getRent_id()%>"/><br/>
            District_id:<input type="text" name="district_id" value="<%= u.getDistrict_id()%>"/><br/>
            <input type="submit" value="Update"/>
        </form>
    </body>
</html>
