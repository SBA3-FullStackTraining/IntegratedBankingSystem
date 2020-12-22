<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Account Management</title>
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<div class="a">
			<h1 align="center">Account Management</h1>
		</div>
		
			<div class="container">
				<ul class="nav nav-tabs nav-justified">
				<spring:form method="post" action="Account",modelAttribute="SavingsAccount">
					<li><a href="SavingsBank.jsp" data-toggle="tab">Savings Bank</a></li>
				</spring:form>
					<li><a href="FixedDeposit.jsp" data-toggle="tab">Fixed Deposit</a></li>
					<li><a href="RecurringDeposit.jsp" data-toggle="tab">Recurring Deposit</a></li>
				</ul>
			</div>
		
		<jsp:include page="footer.jsp"/>
	</body>
</html>