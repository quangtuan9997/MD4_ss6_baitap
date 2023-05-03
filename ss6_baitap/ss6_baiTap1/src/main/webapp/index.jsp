<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="DiscountServlet" method="post" >
   <p>Product Description</p>
    <input type="text">
    <p>List Price</p>
    <input type="number">
    <p>Discount Percent</p>
    <input type="number">
    <input type="submit" value="Calculate Discount">
</form>
</body>
</html>