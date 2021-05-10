<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/user/delete/{id}">
Enter Id : <input type="number" name="id">
<input type="submit" value="Edit">
</form>

<a href="http://localhost:8080/user/new">Add New Grad</a>
<a href="http://localhost:8080/user/edit">Edit a Grad</a>
<a href="http://localhost:8080/user/delete">Delete a Grad</a>
<a href="http://localhost:8080/user/showall">Delete a Grad</a>

</body>
</html>