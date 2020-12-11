
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Recurring Deposit Verification</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/recurringDeposit_verification.css" />
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/background.css" />
	</head>
	<body>
		<spring:form method="post" action ="RecurringDeposit_Verification">
		<h1 align="center" class="a">Recurring Deposit</h1>
		<br><br>
		<table>
			<tr>
				<th colspan="2" class="b">Recurring deposit Verification</th>
			</tr>
			<tr>
				<th><spring:label path = "recdepoaccountNumber" >RD Account ID of Customer:</spring:label></th>
			</tr>
			<tr>
				<th><spring:label path = "recdepositaccholder" >Customer Name:</spring:label></th>
			</tr>
			<tr>
				<th><spring:label path = "depositamount" >Deposit Amount:</spring:label></th>
			</tr>
			<tr>
				<th><spring:label path = "term" >Term Period:</spring:label></th>
			</tr>
			<tr>
				<th><spring:label path = "rateofinterest" >Rate of Interest:</spring:label></th>
			</tr>
			<tr>
				<th><spring:label path = "maturityDate" >Maturity Date:</spring:label></th>
			</tr>
		</table>
		<br>
		<spring:button class="btn btn-danger btn-sm" href ="AccountManagement.html"><b>BACK TO ACCOUNTMANAGEMENT</b></spring:button>
		</spring:form>
		<h2><a href="AccountManagement.jsp">Account Management</a></h2>
	</body>
</html>