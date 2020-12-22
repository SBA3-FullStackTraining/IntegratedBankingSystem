<%@ page import = "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
		<title>Loan Statement</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/statementGeneration.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="get" action="LoanStatement">
		<h1 align="center" class="a">Loan Statement</h1>
		<br><br>
		<table>
			<tr>
				<th colspan="2" class="b">Loan Statement</th>
			</tr>
			<tr>
				<th><spring:label path = "LoanAccountNumber" >Loan Account Number</spring:label></th>
				<td><spring:select path = "LoanAccountNumber"><option value="Account No">Choose Your Account</option>
				<option value="Acc No 1"></option>
				</spring:select>
			</tr>
<%-- 			<tr>
				<th><spring:label path = "LoanStatementType" >Loan Statement Type</spring:label></th>
				<td><spring:select path = ""><option value="Account No">Choose Your Account</option>
				<option value="Mini Statement">Mini Statement</option>
				<option value="Monthly Statement">Monthly Statement</option>
				<option value="Annual Statement">Annual Statement</option>
				<option value="Periodic Statement" >Periodic Statement</option>
				</spring:select>
			</tr> --%>
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
		<%-- <spring:button class="btn btn-danger btn-sm"><b>GENERATE</b></spring:button> --%>
		<spring:input path="Submit" type="submit" value="Generate Statement"/>
		</spring:form>
		<!-- <h2><a href="SavingsBank.jsp">Savings Bank</a></h2> -->
		<jsp:include page="footer.jsp"/>
	</body>
</html>