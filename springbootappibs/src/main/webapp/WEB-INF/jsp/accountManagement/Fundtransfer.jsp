
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Fund Tranfer</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/fundtransfer.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="post" action ="FundTransfer" modelAttribute="Beneficiary">
		<h1 align="center" class="a">Fund Transfer</h1>
		<br><br>
		<table>
			<tr>
				<th colspan="2" class="b">Beneficiary Details</th>
			</tr>
			<tr>
				<th><spring:label path = "benfAccountNumber" >From Account</spring:label></th>
				<td><spring:select path = "benfAccountNumber"><option value="Account No">Choose Your Account</option>
				<option value="Acc No 1"></option>
				</spring:select>
			</tr>
			<tr>
				<th><spring:label path = "benfName" >Beneficiary Account No</spring:label></th>
				<td><spring:select path = "benfName"><option value="Account No">Select Benf  Account</option>
				<option value="Acc No 1"></option>
				<option value="Acc No 2"></option>
				</spring:select>
				</td>
			</tr>
			<tr>
				<th><spring:label path = "benfIFSC" >IFSC_Code</spring:label></th>
				<td><spring:input path = "benfIFSC" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "TransferAmount" >Transfer Amount</spring:label></th>
				<td><spring:input path = "TransferAmount" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "Description" >Transfer AmountTransfer Description</spring:label></th>
				<td><spring:input path = "Description" type ="text" /></td>
			</tr>
			<tr>
				<th><spring:label path = "password" >Transaction Password</spring:label></th>
				<td><spring:input path = "password" type ="password" /></td>
			</tr>
		</table>
		<br>
		<spring:button class="btn btn-danger btn-sm"><b>CONFIRM</b></spring:button>
		</spring:form>
	<h2><a href="SavingsBank">Savings Bank</a></h2>
	<jsp:include page="footer.jsp"/>
	</body>
</html>