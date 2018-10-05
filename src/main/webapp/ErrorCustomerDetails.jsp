
<!DOCTYPE html>
<html>

<head>
    <title>Welcome To Amir's Car Dealership</title>
</head>

<body>
<form action = "ProcessOrder" method = "POST">

    <p>
        Enter all the info before processing order
    </p>
    <p>
       Enter first name: <input type = "text" name = "first_name">
    </p>
    <p>
        Enter last name: <input type = "text" name = "last_name">
    </p>
    <p>
        Enter street name: <input type = "text" name = "street_name">
    </p>
    <p>
        Enter zip code: <input type = "text" name = "zip_code">
    </p>
    <p>
        Enter credit card number: <input type = "text" name = "cc_number">
    </p>
    <p>
        Enter expiry date: <input type = "text" name = "exp_date">
    </p>
    <p>
        Enter security code: <input type = "text" name = "sec_code">
    </p>
    <p>
        <input type = "submit" value = "Process Order" />
    </p>
</form>
</body>
</html>