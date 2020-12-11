
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IBS Home Page</title>
</head>
<body bgcolor="cadetblue">

	<%
		// fetch the data from request object
		//LoginDetails loginInfo = (LoginDetails) request.getAttribute("loginInfo");
		// fetch from session
		// JSP PAGE is exposed with multiple predeclared object : request, response, session , writer...
		// Student student = (Student) session.getAttribute("student");
		String username = session.getAttribute("username").toString();
	%>
	<h1>Hi <%=username%>, Welcome to Integrated Banking System Home Page</h1>
	<br>
	<h2>Explore the options !!!</h2>
	<br>
	<br>
	<b><a href="AccountManagement.html">Account Management</a></b>
</body>
</html>