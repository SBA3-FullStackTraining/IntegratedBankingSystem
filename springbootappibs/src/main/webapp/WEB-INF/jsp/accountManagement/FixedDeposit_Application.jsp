
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix ="spring"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Fixed Deposit Application</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/fixedDeposit_application.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="post" action ="FixedDeposit_Application">
			<h1 align="center" class="a">Fixed Deposit</h1>
			<br><br>
			<table>
				<tr>
					<th colspan="2" class="b">Fixed deposit Application</th>
				</tr>
				<tr>
					<th><spring:label  path = "UID" >UID of Customer</spring:label></th>
					<td><spring:input path = "UID" type ="text" /></td>
				</tr>
				<tr>
					<th><spring:label  path = "CustomerName">Customer Name</spring:label></th>
					<td><spring:input path = "CustomerName" type ="text" /></td>
				</tr>
				<tr>
					<th><spring:label  path = "DepositAmount">Deposit Amount</spring:label></th>
					<td><spring:input path = "DepositAmount" type ="text" /></td>
				</tr>
				<tr>
					<th><spring:label  path = "TermPeriod" >Term Period</spring:label></th>
					<td><spring:input path = "TermPeriod" type ="text"/></td>
				</tr>
				<tr>
					<th><spring:label  path = "Applicationdate" >Application date</spring:label></th>
					<td><spring:input path = "Applicationdate" type ="text"/></td>
				</tr>
			</table>
			<br>
		<spring:button class="btn btn-danger btn-sm"><b>APPLY FD</b></spring:button>
		<h2><a href="AccountManagement.jsp">Account Management</a></h2>
		</spring:form>
		<jsp:include page="footer.jsp"/>
	</body>
</html>