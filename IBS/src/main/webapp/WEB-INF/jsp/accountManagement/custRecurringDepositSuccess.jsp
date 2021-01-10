<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerHome.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
	
	<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
<title>Recurring Deposit-Success</title>
</head>
	<body>
		<jsp:include page="../header.jsp"/>
		<spring:form method="post" action ="">
			<h1 align="center" class="a">Recurring Deposit</h1>
			<br><br>
			<h4>Your Application Submitted successfully!!! Below are the details</h4>
			<center>
			<table>
				<tr>
					<th><label  path = "customerID">Customer ID</label></th>
					<td><input path = "customerID" type ="text" value="${recurringDepositOutputDto.customerID}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "fixedDepositID">Recurring Deposit ID</label></th>
					<td><input path = "fixedDepositID" type ="text" value="${recurringDepositOutputDto.recurringDepositID}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "accHolderName">Account HolderName</label></th>
					<td><input path = "accHolderName" type ="text" value="${recurringDepositOutputDto.accHolderName}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "applicationDate">Application Date</label></th>
					<td><input path = "applicationDate" type ="text" value="${recurringDepositOutputDto.applicationDate}" readonly="true" /></td>
				</tr>
				
				<tr>
					<th><label  path = "term">Term(in years)</label></th>
					<td><input path = "term" type ="text" value="${recurringDepositOutputDto.term}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "ROI">Rate Of Interest</label></th>
					<td><input path = "ROI" type ="text" value="${recurringDepositOutputDto.ROI}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "maturityDate">Maturity Date</label></th>
					<td><input path = "maturityDate" type ="text" value="${recurringDepositOutputDto.maturityDate}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "interestAmt">Interest Amount</label></th>
					<td><input path = "interestAmt" type ="text" value="${recurringDepositOutputDto.interestAmt}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label  path = "totalAmt">Totally Amount after Maturity</label></th>
					<td><input path = "totalAmt" type ="text" value="${recurringDepositOutputDto.totalAmt}" readonly="true" /></td>
				</tr>
			</table>
			</center>
				
		
		</spring:form>
		<br>
		<br>
	
		<center>
			<a href="userHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
	<br>
	<br>
		<jsp:include page="../footer.jsp"/>
	</body>
</html>