<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/user/update">
First Name : <input type="text" name="fname" value="${fname}">
Last Name : <input type="text" name="lname" value="${lname}">
Gender : <input type="text" name="gender" value="${gender}">
Date of Birth : <input type="date" name="dob" value="${dob}">
Email : <input type="email" name="email" value="${email}">
Contact : <input type="number" name="contact" value="${contact}">
Address : <input type="text" name="address" value="${address}">
Age : ${age}
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>

</body>
</html>