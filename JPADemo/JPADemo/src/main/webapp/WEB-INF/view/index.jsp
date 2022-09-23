<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file = "header.jsp" %>
<center>
	<form action="/user/login" method="post">
	UserName 
		<input type="text" name= "userName">
	<br>
	Password
	
		<input type = "password" name = "password">
	<br>
	<input type="submit" value = "login">
	click 
	<a href="/user/registerPage">here</a> from register

</form>
</center>

</body>
</html>