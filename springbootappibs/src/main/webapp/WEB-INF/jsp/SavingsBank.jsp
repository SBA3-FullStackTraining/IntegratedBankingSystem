
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Savings Banking</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/savingbank.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
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
					<li id="z"><a href="${pageContext.request.contextPath}/user/FundTransfer" data-toggle="tab">Fund Transfer</a></li>
					<li id="c"><a href="${pageContext.request.contextPath}/user/BillPayment" data-toggle="tab">Bill Payment</a></li>
					
					<li class="dropdown">
						<a href="javascript:void(0)" class="dropbtn">Statement Generation</a>
						<div class="dropdown-content">
							<a href="${pageContext.request.contextPath}/user/MiniStatement/${savings.customerID}">MINI STATEMENT</a>
							<a href="${pageContext.request.contextPath}/user/MonthlyStatement/${savings.customerID}">MONTHLY STATEMENT</a>
							<a href="#">PERIODIC STATEMENT</a>
							<a href="#">ANNUAL STATEMENT</a>
							
						</div>
					</li>
				</ul>
			</div>
		</spring:form>
		<jsp:include page="footer.jsp"/>
	</body>
</html>