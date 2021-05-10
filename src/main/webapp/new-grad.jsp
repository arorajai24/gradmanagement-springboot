<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/user/save">
First Name : <input type="text" name="fname">
Last Name : <input type="text" name="lname">
Gender : <input type="text" name="gender">
Date of Birth : <input type="date" name="dob">
Email : <input type="email" name="email">
Contact : <input type="number" name="contact">
Address : <input type="text" name="address">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>

<a href="http://localhost:8080/user/new">Add New Grad</a>
<a href="http://localhost:8080/user/edit">Edit a Grad</a>
<a href="http://localhost:8080/user/delete">Delete a Grad</a>
<a href="http://localhost:8080/user/showall">Delete a Grad</a>

</body>
</html>