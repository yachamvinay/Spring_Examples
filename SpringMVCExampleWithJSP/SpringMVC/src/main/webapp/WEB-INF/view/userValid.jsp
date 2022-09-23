<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% out.print("from userValid page"); %>
<% String name = request.getParameter("userName"); 
	String password = request.getParameter("password");
	if(name.equals("Ram") && password.equals("sita")){
		session.setAttribute("username", name);
	%>
<h1> <jsp:include page="welcome.jsp"></jsp:include> </h1>
<%}
else{
	
	%>
	<jsp:forward page="error.jsp">
		<jsp:param value='Not a valid user' name="errorVal"/>
	</jsp:forward>
	<%} %>

</body>
</html>