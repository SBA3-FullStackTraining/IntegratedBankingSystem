
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>RECURRING DEPOSIT</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/recurringDeposit.css" />
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/background.css" />
	</head>
	<body>
		<div class="a">
			<h1 align="center">RECURRING DEPOSIT</h1>
		</div>
		
		<spring:form method="post" action="RecurringDeposit">
			<div class="container">
				<ul class="nav nav-tabs nav-justified">
					<li id="z"><a href="RecurringDeposit_Application.jsp" data-toggle="tab">APPLY FOR RD</a></li>
					<li id="b"><a href="RecurringDeposit_Verificacation.jsp" data-toggle="tab">VERIFY YOUR RD DETAILS</a></li>
				</ul>
			</div>
		</spring:form>
	</body>
</html>