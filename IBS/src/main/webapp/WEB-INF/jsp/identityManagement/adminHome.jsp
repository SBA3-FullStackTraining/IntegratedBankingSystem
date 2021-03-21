<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/index.css" />

<title>IBS Admin Home Page</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<p>Admin Login</p>
	<ul>
	<li><a href="#">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Identity Management</a>
			<div class="dropdown-content">
				<a href="userRegProcess">Approve/Decline requests</a>
			</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Account Management</a>
			<div class="dropdown-content">
				<a href="${pageContext.request.contextPath}/admin/PeriodicStatement">Periodic Statements</a>
				<a href="${pageContext.request.contextPath}/admin/MonthlyStatement">Monthly Statements</a>
				<a href="${pageContext.request.contextPath}/admin/AnnualStatement">Annual Statements</a>
				<a href="${pageContext.request.contextPath}/admin/Withdrawal">Withdrawal Requests</a>
			</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Loan Management</a>
			<div class="dropdown-content">
				<a href="${pageContext.request.contextPath}/admin/adminUpdateloan">Approve/Decline/Update Loan</a>
				<a href="${pageContext.request.contextPath}/admin/adminPreClose">Approve/Decline Pre-closures</a>
			</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Service Provider Management</a>
			<div class="dropdown-content">
				<a href="${pageContext.request.contextPath}/admin/RegisterServiceProvider">Register Service Provider</a>
				<a href="${pageContext.request.contextPath}/admin/ApproveDeclineSP">Approve/Decline SP-Requests</a>
				
			</div>
		</li>
		<li><a href="#">Credit/Debit card Management</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Admin Profile</a>
			<div class="dropdown-content">
				<a href="logout" >Sign Out</a>
				<!-- onclick="form.action='SecondServlet';" -->
			</div>
		</li>
	</ul>
	<h4>Hi Admin,</h4>
	<h3>Welcome to Integrated Banking System Home Page</h3>
	<br>
	<h2>Explore the options of Admin!!!</h2>
	<br>
	<br>
	<jsp:include page="../footer.jsp"/>
</body>
</html>