
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Fund Deposit Application</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/fundDeposit_admin.css" />
		<link rel="stylesheet" type="text/css" href="resources/css/accountManagement/background.css" />
	</head>
	<body>
		<spring:form method="post" action="FundDeposit">
		<h1 align="center" class="a">Fund Deposit Entry</h1>
		<br><br>
		<table>
			<tr>
				<th colspan="2" class="b">Sender Details</th>
			</tr>
			<tr>
				<th><spring:label path = "senderName" >Sender Name</spring:label></th>
				<td><spring:input path = "senderName
				" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "benfAccountNumber" >Account Number</spring:label></th>
				<td><spring:input path = "benfAccountNumber" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "TransferAmount" >Transfer Amount</spring:label></th>
				<td><spring:input path = "TransferAmount" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "IFSC_Code" >IFSC_Code</spring:label></th>
				<td><spring:input path = "IFSC_Code" type ="text" /></td>
			</tr>
		</table>
		<table>
			<tr>
				<th colspan="2" class="b">Recipient Details</th>
			</tr>
			<tr>
				<th><spring:label path = "benfName" >Recipient Name</spring:label></th>
				<td><spring:input path = "benfName" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "benfAccountNumber" >Recipient Account Number</spring:label></th>
				<td><spring:input path = "benfAccountNumber" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "benfBankName" >Recipient Bank Name</spring:label></th>
				<td><spring:input path = "benfBankName" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "benfIFSC" >IFSC_Code</spring:label></th>
				<td><spring:input path = "benfIFSC" type ="text" /></td>
			</tr>
		</table>
		<br>
		<spring:button class="btn btn-danger btn-sm"><b>CONTINUE FUND DEPOSIT</b></spring:button>
		</spring:form>
		<h2><a href="AccountManagement">Account Management</a></h2>
	</body>
</html>