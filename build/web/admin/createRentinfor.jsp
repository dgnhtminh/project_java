<%-- 
    Document   : createRentinfor
    Created on : 17-10-2024, 00:03:32
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create rentinfor</title>
    </head>
    <body>
        <h1>Add new a rentinfor</h1>
        <form action="create-rentinfor" method="post">
            Customer_name:<input type="text" name="customer_name" required/><br/>
            Phone:<input type="text" name="phone" required/><br/>
            Email:<input type="text" name="email" required/><br/>
            Customer_note:<input type="text" name="customer_note" required/><br/>
            Pick_up_date:<input type="date" name="pick_up_date" required/><br/>
            Pick_off_date:<input type="date" name="pick_off_date" required/><br/>
            Pick_up_location:<input type="text" name="pick_up_location" required/><br/>
            Pick_off_location:<input type="text" name="pick_off_location" required/><br/>
            Id_user:<input type="text" name="id_user" required/><br/>
            Time_sent:<input type="date" name="time_sent" required/><br/>
            Status:<input type="text" name="status" required/><br/>
            <input type="submit" value="Create"/>
        </form>
    </body>
</html>
