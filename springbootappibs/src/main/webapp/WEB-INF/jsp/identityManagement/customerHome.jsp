
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/index.css" />

<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
<title>IBS Customer Home Page</title>
</head>
<body>
	<p>Customer Login</p>
	<%
		//String username = session.getAttribute("username").toString();
		//Customer customerData = (Customer) session.getAttribute("customerInfo");
	%>
	<h3>Hi ${customerInfo.firstName}</h3>
	<ul>
		<li><a href="#home">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Account Management</a>
			<div class="dropdown-content">
					<a href="${pageContext.request.contextPath}/user/Savings/${customerInfo.customerID}">Savings Account</a>
					<!-- <a href="javascript:void(0)" class="dropbtn">Fixed Deposit</a> -->
				<!-- <div class="dropdown-content"> -->
					<a href="${pageContext.request.contextPath}/user/FixedDeposit_Application/${customerInfo.customerID}">Fixed Deposit Application</a>
					<a href="${pageContext.request.contextPath}/user/FixedDeposit_Verification/${customerInfo.customerID}">Fixed Deposit Verification</a>
				<!-- </div>
					<a href="javascript:void(0)" class="dropbtn">Recurring Deposit</a>
					<div class="dropdown-content"> -->
					<a href="${pageContext.request.contextPath}/user/RecurringDeposit_Application/${customerInfo.customerID}">Recurring Deposit Application</a>
					<a href="${pageContext.request.contextPath}/user/RecurringDeposit_Verification/${customerInfo.customerID}">Recurring Deposit Verification</a>
				<!-- </div> -->
			</div>
		</li>

		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Loan Management</a>
			<div class="dropdown-content">
			<a href="${pageContext.request.contextPath}/user/ApplyLoan/${customerInfo.customerID}">Apply Loan</a>
				<a href="${pageContext.request.contextPath}/user/PayLoanEmi/${customerInfo.customerID}">Pay EMI</a>
				<a href="${pageContext.request.contextPath}/user/LoanStatement/${customerInfo.customerID}">Generate Loan statement</a>
				<a href="${pageContext.request.contextPath}/user/LoanClosure/${customerInfo.customerID}">Request Loan closure</a>
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
				<a href="customerViewDetails/${customerInfo.customerID}" >View My Details</a>
				<a href="customerUpdateDetails?passwordReset=request" >Reset password</a>
				<a href="logout" >Sign Out</a>
			</div>
		</li>
	</ul>

	<h3>Welcome to Integrated Banking System Home Page</h3>
	<b>Choose from the above options </b>
	<br>
	
	<br>
	<br>
	<input type="hidden" name="customerID" value="${customerInfo.customerID}" />
</body>
</html>