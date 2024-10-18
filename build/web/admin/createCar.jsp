<%-- 
    Document   : createCar
    Created on : 15-10-2024, 18:45:33
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Car</title>
    </head>
    <body>
        <h1>Add new a car</h1>
        <form action="create-car" method="post">
            Car name:<input type="text" name="carname" required/><br/>
            Seats:<input type="text" name="seats" required/><br/>
            Fuel:<input type="text" name="fuel" required/><br/>
            Transmission:<input type="text" name="transmission" required/><br/>
            Luggage<input type="text" name="luggage" required/><br/>
            Img:<input type="text" name="img" required/><br/>
            Description:<input type="text" name="description" required/><br/>
            Rate:<input type="text" name="rate" required/><br/>
            Status:<input type="text" name="status" required/><br/>
            Color:<input type="text" name="color" required/><br/>
            Price:<input type="text" name="price" required/><br/>
            Year of manufacture:<input type="text" name="year_of_manufacture" required/><br/>
            Current address:<input type="text" name="current_address" required/><br/>
            Car_type_id:<input type="text" name="car_type_id" required/><br/>
            Car_brand_id:<input type="text" name="car_brand_id" required/><br/>
            Rent_id:<input type="text" name="rent_id" required/><br/>
            District_id:<input type="text" name="district_id" required/><br/>
            <input type="submit" value="Create"/>
        </form>
    </body>
</html>
