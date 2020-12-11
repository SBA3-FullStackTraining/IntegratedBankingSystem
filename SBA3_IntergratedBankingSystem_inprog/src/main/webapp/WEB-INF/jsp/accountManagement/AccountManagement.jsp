<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Account Management</title>
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/background.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	</head>
	<body>
		<div class="a">
			<h1 align="center">Account Management</h1>
		</div>
		<spring:form method="post" action="Account">
			<div class="container">
				<ul class="nav nav-tabs nav-justified">
					<li><a href="SavingsBank.jsp" data-toggle="tab">Savings Bank</a></li>
					<li><a href="FixedDeposit.jsp" data-toggle="tab">Fixed Deposit</a></li>
					<li><a href="RecurringDeposit.jsp" data-toggle="tab">Recurring Deposit</a></li>
				</ul>
			</div>
		</spring:form>
	</body>
</html>