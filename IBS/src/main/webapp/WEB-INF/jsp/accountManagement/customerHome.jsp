
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
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
	
	<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
<title>IBS Customer Home Page</title>
</head>
<body>
	<jsp:include page="../header.jsp"/>
	<p>Customer Login</p>
	<%
		//String username = session.getAttribute("username").toString();
		//Customer customerData = (Customer) session.getAttribute("customerInfo");
	%>
	<h3>${customerInfo.customerID}</h3>
	<ul>
		<li><a href="#home">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Account Management</a>
			<div class="dropdown-content">
					<a href="${pageContext.request.contextPath}/user/Savings">Savings Account</a>
					<a href="${pageContext.request.contextPath}/user/Savings_Application">Savings Account Application</a>
					<a href="${pageContext.request.contextPath}/user/FixedDeposit_Application">Fixed Deposit Application</a>
					<a href="${pageContext.request.contextPath}/user/FixedDeposit_Verification">Fixed Deposit Verification</a>
					<a href="${pageContext.request.contextPath}/user/RecurringDeposit_Application">Recurring Deposit Application</a>
					<a href="${pageContext.request.contextPath}/user/RecurringDeposit_Verification">Recurring Deposit Verification</a>
				</div>
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
	
	<br>
	<br>
	<jsp:include page="../footer.jsp"/>
</body>
</html>