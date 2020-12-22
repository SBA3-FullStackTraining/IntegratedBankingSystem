
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Withdraw</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/withdraw_admin.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="post" action="Withdrawal">
		<h1 align="center" class="a">Withdraw Request Entry</h1>
		<br><br>
			<table>
				<tr>
					<th colspan="2" class="b">Recipient Details</th>
				</tr>
				<tr>
					<th><spring:label path = "Account No" >Account No</spring:label></th>
					<td><spring:input path = "Account No" type ="text" /></td>
				</tr>
				<tr>
					<th><spring:label path = "Account Holder Name" >Account Holder Name</spring:label></th>
					<td><spring:input path = "Account Holder Name" type ="text" /></td>
				</tr>
				<tr>
					<th><spring:label path = "IFSC_Code" >IFSC_Code:</spring:label></th>
					<td><spring:input path = "IFSC_Code" type ="text" /></td>
				</tr>
				<tr>
					<th><spring:label path = "Withdraw Amount" >Withdraw Amount</spring:label></th>
					<td><spring:input path = "Withdraw Amount" type ="text" /></td>
				</tr>
			</table>
			<br>
		<spring:button class="btn btn-danger btn-sm"><b>SUBMIT</b></spring:button>
		<br>
		<br>
		<h5>Account No:</h5>
		<h5>Account Balance:</h5>
		<br>
		<spring:button align="center" class="btn btn-danger btn-sm"><b>CONTINUE WITHDRAW</b></spring:button>
		</spring:form>
		<h2><a href="AccountManagement">Account Management</a></h2>
		<jsp:include page="footer.jsp"/>
	</body>
</html>