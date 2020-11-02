<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/background.css" />
<link rel="stylesheet" type="text/css" href="resources/css/customerHome.css" />
<title>IBS Admin Home Page</title>
</head>
<body>
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
				<a href="#">Apply/Decline Loan requests</a>
				<a href="#">Apply/Decline Pre-closures</a>
			</div>
		</li>
		<li><a href="#service_provider">Service Provider Management</a></li>
		<li><a href="#crdit_debit_mng">Credit/Debit card Management</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">User Profile</a>
			<div class="dropdown-content">
				<a href="#">View details</a>
				<a href="#">Reset password</a>
				<a href="index.html" >Sign Out</a>
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

</body>
</html>