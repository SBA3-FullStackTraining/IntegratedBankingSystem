<%@page import="com.banking.ibs.dto.Customer"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/background.css" />
<link rel="stylesheet" type="text/css" href="resources/css/customerHome.css" />
<title>IBS Customer Home Page</title>
</head>
<body>
	<p>Customer Login</p>
	<%
		String username = session.getAttribute("username").toString();
		Customer customerData = (Customer) session.getAttribute("customerInfo");
	%>
	<h4>Hi <span id="user"><%=username%></span>,</h4>
	<ul>
		<li><a href="#home">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Account Management</a>
			<div class="dropdown-content">
				<a href="#">Open new account</a>
				<a href="#">Balance check</a>
				<a href="#">Request statements</a>
				<a href="#">Transfer funds</a>
				<a href="#">Pay bills</a>
			</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Loan Management</a>
			<div class="dropdown-content">
				<a href="#">Apply Loan</a>
				<a href="#">Pay EMI</a>
				<a href="#">Generate statement</a>
				<a href="#">Request closure</a>
			</div>
		</li>
		<li><a href="serviceManagement">Service Provider Management</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Credit/Debit card Management</a>
			<div class="dropdown-content">
				<a href="#">Apply Credit/Debit card</a>
				<a href="#">Reset PIN</a>
				<a href="#">Report Loss of card</a>
				<a href="#">Card Upgrade</a>
				<a href="#">Request card statement</a>
				<a href="#">Report statement mismatch</a>
			</div>
		</li>
		<li><a href="#beneficiary">Beneficiary Management</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">User Profile</a>
			<div class="dropdown-content">
				<a href="customerViewDetails">View My Details</a>
				<!-- <a href="./WEB-INF/jsp/identityManagement/customerResetPassword.jsp" onclick="window.open('./WEB-INF/jsp/identityManagement/customerResetPassword.jsp', 'newwindow', 'width=800,height=400'); return false;" name="resetPassword">Reset password</a> -->
				<a href="customerUpdateDetails?passwordReset=request" >Reset password</a>
				<a href="logout" >Sign Out</a>
				<!-- onclick="form.action='SecondServlet';" -->
			</div>
		</li>
	</ul>

	<h3>Welcome to Integrated Banking System Home Page</h3>
	<br>
	<h2>Explore the options of Customer!!!</h2>
	<p>Account ID : <%=customerData.getAccountID()%></p>
	<p>Phone Number : <%=customerData.getPhoneNumber()%></p>
	<br>
	<br>

</body>
</html>