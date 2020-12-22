
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix ="spring"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Fixed Deposit Verification</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/fixedDeposit_verification.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="post" action ="FixedDeposit_Verification">
			<h1 align="center" class="a">Fixed Deposit</h1>
			<br><br>
			<table>
				<tr>
					<th colspan="2" class="b">Fixed deposit Verification</th>
				</tr>
				<tr>
					<th><spring:label path = "fixeddepositaccholder" >Customer Name:</spring:label></th>
					<td><spring:input path = "fixeddepositaccholder" type ="text" />${FixedDeposit.fixeddepositaccholder}</td>
				</tr>
				<tr>
					<th><spring:label  path = "Deposit Account" >Deposit Account:</spring:label>
					<td><spring:input path = "Deposit Amount" type ="text" />${FixedDeposit.fixedDepositAmount}</td>
				</tr>
				<tr>
					<th><spring:label  path = "Term Period">Term Period:</spring:label></th>
					<td><spring:input path = "Term Period" type ="text" />${FixedDeposit.term}</td>
				</tr>
				<tr>
					<th><spring:label  path = "Rate of Interest" >Rate of Interest:</spring:label></th>
					<td><spring:input path = "Rate of Interest" type ="text" />${FixedDeposit.rateofinterest}</td>
				</tr>
				<tr>
					<th><spring:label  path = "Maturity Date" >Maturity Date:</spring:label></th>
					<td><spring:input path = "Maturity Date" type ="text" />${FixedDeposit.maturitydate}</td>
				</tr>
			
			</table>
			<br>
			<spring:button class="btn btn-danger btn-sm" href ="AccountManagement.jsp"><b>BACK TO ACCOUNT MANAGEMENT</b></spring:button>
			
		</spring:form>
		<jsp:include page="footer.jsp"/>
	</body>
</html>