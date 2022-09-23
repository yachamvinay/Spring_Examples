<%@page import="com.GL.JPADemo.dao.UserDAOImpl"%>
<%@page import="com.GL.JPADemo.dao.UserDAO"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<center>
<h2>Users List</h2>
<c:if test = "${not empty users }">
<ul>
    <c:forEach var="user" items="${users}">
    	<li>${user}</li>
    </c:forEach>

</ul>
</c:if>
<ul>

</ul>
</center>

</body>
</html>