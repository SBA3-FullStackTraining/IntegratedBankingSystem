
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>FIXED DEPOSIT</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/fixedDeposit.css" />
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/background.css" />
	</head>
	<body>
		<div class="a">
			<h1 align="center">FIXED DEPOSIT</h1>
		</div>
		<spring:form method="post" action="Account">
			<div class="container">
				<ul class="nav nav-tabs nav-justified">
					<li id="z"><a href="FixedDeposit_Application.jsp" data-toggle="tab">APPLY FOR FD</a></li>
					<li id="b"><a href="FixedDeposit_Verification.jsp" data-toggle="tab">VERIFY YOUR FD DETAILS</a></li>
				</ul>
			</div>
		</spring:form>
	</body>
</html>