<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="static/css/identityManagement/background.css" />
<link rel="stylesheet" type="text/css" href="static/css/identityManagement/customerHome.css" />
<title>IBS Admin Home Page</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<p>Admin Login</p>
	<ul>
	<li><a href="#home">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Identity Management</a>
			<div class="dropdown-content">
				<a href="#">Approve/Decline requests</a>
			</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Account Management</a>
			<div class="dropdown-content">
				<a href="#">Request periodic statements</a>
				<a href="#">Funds Deposit entry</a>
			</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Loan Management</a>
			<div class="dropdown-content">
				<a href="#">Update Loan Types/Interests</a>
				<a href="#">Approve/Decline Loan requests</a>
				<a href="#">Approve/Decline Pre-closures</a>
			</div>
		</li>
		<li><a href="#service_provider">Service Provider Management</a></li>
		<li><a href="#credit_debit_mng">Credit/Debit card Management</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">User Profile</a>
			<div class="dropdown-content">
				<a href="#">View details</a>
				<a href="#">Reset password</a>
				<a href="index.jsp" >Sign Out</a>
				<!-- onclick="form.action='SecondServlet';" -->
			</div>
		</li>
	</ul>
	<%
		String username = session.getAttribute("userID").toString();
	%>
	<h4>Hi <%=username%>,</h4>
	<h3>Welcome to Integrated Banking System Home Page</h3>
	<br>
	<h2>Explore the options of Admin!!!</h2>
	<br>
	<br>
	<jsp:include page="footer.jsp"/>
</body>
</html>