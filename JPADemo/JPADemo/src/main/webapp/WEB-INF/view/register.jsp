
<%@page import="com.GL.JPADemo.dao.UserDAOImpl"%>
<%@page import="com.GL.JPADemo.dao.UserDAO"%>
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
	<form action= "/user/registerUser" method="post">
	id <input type="number" name= "id">
	<br>
	UserName <input type="text" name= "userName">
	<br>
	Password <input type = "password" name = "password">
	<br>
	Email <input type = "email" name = "email">
	<br>
	First Name <input type = "text" name = "firstName">
	<br>
	Last Name <input type = "text" name = "lastName">
	<br>
	
	<input type="submit" value = "Register">
	
	

</form>



</center>



</body>
</html>