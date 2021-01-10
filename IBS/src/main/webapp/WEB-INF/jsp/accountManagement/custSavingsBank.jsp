
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
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />

<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
		<title>Savings Banking</title>
	</head>
	<body>
		<jsp:include page="../header.jsp"/>
		<div class="a">
			<h1 align="center">Savings Banking</h1>
		</div>
		<!--<h3>Savings Bank Details</h3><br>  -->
		<h5>Customer Name: <b>${savings.accHolderName}</b></h5>
		<h5>Savings Account Number: <b>${savings.savingsAccID}</b></h5>
		<h5>Available Balance: </b>${savings.avlBalance}</b></h5>
		<br>
		<br>
		<spring:form class="loginform" method="post">
			<div class="container">
				<ul class="nav nav-tabs nav-justified">
					<li id="z"><a href="${pageContext.request.contextPath}/user/FundTransfer" data-toggle="tab">Transfer Funds</a></li>
					<li id="c"><a href="${pageContext.request.contextPath}/user/BillPayment" data-toggle="tab">Pay Utility Bills</a></li>
					
					<li class="dropdown">
						<a href="javascript:void(0)" class="dropbtn">Statement Generation</a>
						<div class="dropdown-content">
							<a href="${pageContext.request.contextPath}/user/MiniStatement">MINI STATEMENT</a>
							<a href="${pageContext.request.contextPath}/user/MonthlyStatement">MONTHLY STATEMENT</a>
							<a href="${pageContext.request.contextPath}/user/PeriodicStatement">PERIODIC STATEMENT</a>
							<a href="${pageContext.request.contextPath}/user/AnnualStatement">ANNUAL STATEMENT</a>
							
						</div>
					</li>
				</ul>
			</div>
		</spring:form>
		<br>
		<br>
		<br>
		<!-- <a href="identityManagement/customerHome" data-toggle="tab">BACK</a> -->
		<center>
			<a href="userHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
		<br>
		<br>
		<jsp:include page="../footer.jsp"/>
	</body>
</html>