
<%@ page import="com.dealership.cars.Oders.OderDetails" %>
<%@ page import="com.dealership.cars.Oders.ProcessedOrder" %>
<!DOCTYPE html>
<html>

<head>
    <title>Welcome To Amir's Car Dealership</title>
</head>

<body>
<% ProcessedOrder finalSummary = (ProcessedOrder)request.getSession().getAttribute("final_order");%>

<form action = "CompletedOrder" method = "POST">

    <p>
        Order will be placed on <%= finalSummary.getOrderDate()%>. Details....
    </p>
    <p>
        Car type you selected is: <%= finalSummary.getOrderDetails().getCarType()%>
    </p>
    <p>
        Car color you selected is: <%= finalSummary.getOrderDetails().getCarColor()%>
    </p>
    <p>
        Car price you selected is: <%= finalSummary.getOrderDetails().getCarPrice()%>
    </p>

    <p>
        Name: <%= finalSummary.getFirstName()%>  <%= finalSummary.getLastName()%>
    </p>
    <p>
        Address: <%= finalSummary.getStreetName()%>  <%= finalSummary.getZipCode()%>
    </p>
    <p>
        Last four credit card number: <%=finalSummary.getCCNumber().substring(finalSummary.getCCNumber().length() - 4)%>
    </p>
    <p>
        Expiry date: <%=finalSummary.getExpiryDate()%>
    </p>

    <p>
        <input type = "submit" value = "Process Order" />
    </p>
</form>
</body>
</html>