
<%@ page import="com.dealership.cars.Oders.ProcessedOrder" %>
<!DOCTYPE html>
<html>

<head>
    <title>Welcome To Amir's Car Dealership</title>
</head>

<body>
<% ProcessedOrder order = (ProcessedOrder)request.getSession().getAttribute("final_order");%>
<p>
    Order sucessful. Your order number is: <%= order.getOrderNumber()%>
</p>

</body>
</html>