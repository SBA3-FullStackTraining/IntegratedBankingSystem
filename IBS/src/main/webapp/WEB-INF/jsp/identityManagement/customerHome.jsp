
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
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerResetPassword.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/index.css" />

<!-- <style>
body {
  background-image: url('../static/img/ibs_main.jpg');
  background-repeat: no-repeat;
  height: auto;
  width: auto;
}
</style> -->

<title>IBS Customer Home Page</title>
</head>
<body>
<jsp:include page="header.jsp"/>
	<h3>Hi ${customerInfo.firstName}</h3>
	
	<c:if test="${customerInfo.kycStatus=='approved'}">
	<ul>
		<li><a href="#home">Home</a></li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Account Management</a>
			<div class="dropdown-content">
					<a href="${pageContext.request.contextPath}/user/Savings_Application">Savings Account Application</a>
					<a href="${pageContext.request.contextPath}/user/Savings">Savings Account Management</a>
					<a href="${pageContext.request.contextPath}/user/FixedDeposit_Application">Fixed Deposit Application</a>
					<a href="${pageContext.request.contextPath}/user/FixedDeposit_Verification">Fixed Deposit Verification</a>
					<a href="${pageContext.request.contextPath}/user/RecurringDeposit_Application">Recurring Deposit Application</a>
					<a href="${pageContext.request.contextPath}/user/RecurringDeposit_Verification">Recurring Deposit Verification</a>
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
		
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Service Provider Management</a>
			<div class="dropdown-content">
				<a href="ServiceManagement" >View All Service Providers List</a>
			</div>
		</li>
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
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">Beneficiary Management</a>
			<div class="dropdown-content">
				<a href="viewAllBeneficiary" >View All Beneficiary List</a>
				<a href="addBeneficiary" >Add Beneficiary</a>
				<a href="modifyBeneficiary" >Modify Beneficiary</a>
			</div>
		</li>
		<li class="dropdown">
			<a href="javascript:void(0)" class="dropbtn">User Profile</a>
			<div class="dropdown-content">
				<a href="customerViewDetails" >View My Details</a>
				<a href="passwordUpdate" >Reset password</a>
				<a href="logout" >Sign Out</a>
			</div>
		</li>
	</ul>

	<h3>Welcome to Integrated Banking System Home Page</h3>
	<b>Choose from the above options </b>
	<br>
	<%-- <center><img src="../static/img/ibs_main.jpg" alt="ibs_main" height=100% width=100%/></center> --%>
	<br>
	<br>
	<input type="hidden" name="customerID" value="${customerInfo.customerID}" />
	</c:if>
	
	<c:if test="${customerInfo.kycStatus=='pending'}">
	<div align="center">
	<h3>Your KYC status is in Pending state.</h3>
	</div>
	<div class="table">
	<h4  align="center">Below mentioned are the further process involved.</h4>
	<p align="center">An Accounts Executive from IBS will verify those details and Approve/Decline the registration request.</p>		
	</div>
	<div align="center">
	<a href="logout"><input type="button" value="Sign Out" id="btnOk"/></a>
	</div>
	</c:if>
	
	<c:if test="${customerInfo.kycStatus=='decline'}">
	<div align="center">
	<h3>Your KYC status Declined.</h3>
	<p align="center"><b>Your Registration not processed. Thanks for your interest</b></p>
	</div>
	<div align="center">
	<a href="logout"><input type="button" value="Sign Out" id="btnOk"/></a>
	</div>
	</c:if>
	
	
	<jsp:include page="../footer.jsp"/>
</body>
</html>