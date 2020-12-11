
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Savings Banking</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/savingbank.css" />
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/background.css" />
	</head>
	<body>
		<div class="a">
			<h1 align="center">Savings Banking</h1>
		</div>
		<h3>Savings Bank Details</h3><br>
		<h5>Customer Name:</h5>
		<h5>Savings Account Number:</h5>
		<h5>Available Balance:</h5>
		<br>
		<br>
		<spring:form class="loginform" method="post" action="CustSavingsBank">
			<div class="container">
				<ul class="nav nav-tabs nav-justified">
					<li id="z"><a href="Fundtransfer.jsp" data-toggle="tab">Fund Transfer</a></li>
					<li id="b"><a href="StatementGeneration.jsp" data-toggle="tab">Statement generation</a></li>
					<li id="c"><a href="BillPayment.jsp" data-toggle="tab">Bill Payment</a></li>
				</ul>
			</div>
		</spring:form>
	</body>
</html>