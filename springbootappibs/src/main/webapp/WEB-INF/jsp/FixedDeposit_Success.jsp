
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
		<spring:form method="post" action ="">
			<h1 align="center" class="a">Fixed Deposit</h1>
			<br><br>
			<h4>Your Application Submitted successfully!!! Below are the details</h4>
			<center>
			<table>
				<tr>
					<th><label  path = "customerID">Customer ID</label></th>
					<td><input path = "customerID" type ="text" value="${fixedDepositOutputDto.customerID}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "fixedDepositID">FixedDeposit ID</label></th>
					<td><input path = "fixedDepositID" type ="text" value="${fixedDepositOutputDto.fixedDepositID}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "accHolderName">Account HolderName</label></th>
					<td><input path = "accHolderName" type ="text" value="${fixedDepositOutputDto.accHolderName}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "applicationDate">Application Date</label></th>
					<td><input path = "applicationDate" type ="text" value="${fixedDepositOutputDto.applicationDate}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "fixedDepositAmt">Fixed Deposit Amount</label></th>
					<td><input path = "fixedDepositAmt" type ="text" value="${fixedDepositOutputDto.fixedDepositAmt}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "term">Term(in years)</label></th>
					<td><input path = "term" type ="text" value="${fixedDepositOutputDto.term}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "ROI">Rate Of Interest</label></th>
					<td><input path = "ROI" type ="text" value="${fixedDepositOutputDto.ROI}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "maturityDate">Maturity Date</label></th>
					<td><input path = "maturityDate" type ="text" value="${fixedDepositOutputDto.maturityDate}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "interestAmt">Interest Amount</label></th>
					<td><input path = "interestAmt" type ="text" value="${fixedDepositOutputDto.interestAmt}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "totalAmt">Totally Amount after Maturity</label></th>
					<td><input path = "totalAmt" type ="text" value="${fixedDepositOutputDto.totalAmt}" readonly="true" /></td>
				</tr>
			</table>
			</center>
				
		
		</spring:form>
		<jsp:include page="footer.jsp"/>
	</body>
</html>