
<%@ page import = "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
		<head>
		<title>Generate Statement</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/statementGeneration.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="post" action="StatementGeneration">
		<h1 align="center" class="a">Statement  Generation</h1>
		<br><br>
		<table>
			<tr>
				<th colspan="2" class="b">Statement Generation</th>
			</tr>
			<tr>
				<th><spring:label path = "AccountNumber" >Account Number</spring:label></th>
				<td><spring:select path = "AccountNumber"><option value="Account No">Choose Your Account</option>
				<option value="Acc No 1"></option>
				</spring:select>
			</tr>
			<tr>
				<th><spring:label path = "AccountHolderName" >Account Holder Name</spring:label></th>
			</tr>
			<tr>
				<th><spring:label path = "StatementType" >Statement Type</spring:label></th>
				<td><spring:select path = "AccountNo"><option value="Account No">Choose Your Account</option>
				<option value="Mini Statement">Mini Statement</option>
				<option value="Monthly Statement">Monthly Statement</option>
				<option value="Annual Statement">Annual Statement</option>
				<option value="Periodic Statement" >Periodic Statement</option>
				</spring:select>
			</tr>
			<tr>
				<th><spring:label path = "FromDate" >From Date</spring:label></th>
				<td><spring:input path = "FromDate" type ="date" /></td>
			</tr>
			<tr>
				<th><spring:label path = "ToDate" >To Date</spring:label></th>
				<td><spring:input path = "ToDate" type ="date" /></td>
			</tr>
		</table>
		<br>
		<spring:button class="btn btn-danger btn-sm" type ="submit"><b>GENERATE</b></spring:button>
		</spring:form>
		<h2><a href="SavingsBank.jsp">Savings Bank</a></h2>
		<jsp:include page="footer.jsp"/>
	</body>
</html>