
<%@ page import="com.dealership.cars.Oders.OderDetails" %>
<!DOCTYPE html>
<html>

<head>
    <title>Welcome To Amir's Car Dealership</title>
</head>

<body>
<% OderDetails order = (OderDetails)request.getSession().getAttribute("carType");%>

<form action = "OrderReview" method = "POST">

    <p>
        Car type you selected is: <%= order.getCarType()%>
    </p>
    <p>
        Car color you selected is: <%= order.getCarColor()%>
    </p>
    <p>
        Car price you selected is: <%= order.getCarPrice()%>
    </p>


    <p>
        <input type = "submit" value = "Process Order" />
    </p>
</form>
</body>
</html>