
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		
		<title>Fixed Deposit Application</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/recurringDeposit_application.css" />
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/background.css" />
	</head>
	<body>
		<spring:form method="post" action ="RecurringDeposit_Application">
		<h1 align="center" class="a">Fixed deposit</h1>
		<br><br>
		<table>
			<tr>
				<th colspan="2" class="b">Fixed deposit Application</th>
			</tr>
			<tr>
				<th><spring:label path = "UIDofCustomer" >UID of Customer</spring:label></th>
				<td><spring:input path = "UIDofCustomer" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "CustomerName" >Customer Name</spring:label></th>
				<td><spring:input path = "CustomerName" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "MonthlyDeposit" >Monthly Deposit</spring:label></th>
				<td><spring:input path = "MonthlyDeposit" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "TermPeriod" >Term Period</spring:label></th>
				<td><spring:input path = "TermPeriod" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "Applicationdate" >Application date</spring:label></th>
				<td><spring:input path = "Applicationdate" type="date"/></td>
			</tr>
		</table>
		<br>
		<spring:button class="btn btn-danger btn-sm"><b>APPLY RD</b></spring:button>
		</spring:form>
		<h2><a href="AccountManagement.jsp">Account Management</a></h2>
	</body>
</html>