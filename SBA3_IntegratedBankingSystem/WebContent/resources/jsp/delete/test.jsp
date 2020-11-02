<%@page import="com.banking.ibs.dto.LoginDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/background.css" />
<title>IBS Home Page</title>
</head>
<body>

	<%
		// fetch the data from request object
		//LoginDetails loginInfo = (LoginDetails) request.getAttribute("loginInfo");
		// fetch from session
		// JSP PAGE is exposed with multiple predeclared object : request, response, session , writer...
		// Student student = (Student) session.getAttribute("student");
		String username = session.getAttribute("userID").toString();
	%>
	<h1>Admin Login</h1>
	<h3>Hi <%=username%>, Welcome to Integrated Banking System Home Page</h3>
	<br>
	<h2>Explore the options !!!</h2>
	<br>
	<br>
	<form action="logout" method="post">
    	<input type="submit" value="Logout">
    </form>
</body>
</html>