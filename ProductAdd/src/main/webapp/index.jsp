<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addProduct" method="post">
        <label for="name">Product Name:</label>
        <input type="text" name="name" required><br>

        <label for="price">Product Price:</label>
        <input type="text" name="price" required><br>

        <input type="submit" value="Add Product">
    </form>

</body>
</html>