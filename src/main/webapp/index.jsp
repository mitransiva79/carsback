<%@ page import="javax.persistence.criteria.Order" %>
<%@ page import="com.dealership.cars.Oders.OderDetails" %>
<!DOCTYPE html>
<html>

<head>
    <title>Welcome To Amir's Car Dealership</title>
</head>

<body>
<% OderDetails order = (OderDetails)request.getAttribute("order");%>

<form action = "OrderFormCar" method = "POST">

    <p>
       Enter the car make you want to order: <input type = "text" name = "car_type">
    </p>
    <p>
        <input type = "submit" value = "Check Availability" />
    </p>
</form>
</body>
</html>