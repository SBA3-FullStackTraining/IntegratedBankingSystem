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
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />
	
	<link rel="stylesheet" type="text/css" href="../../static/css/background.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/customerHome.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/index.css" />
	<link rel="stylesheet" type="text/css" href="../../static/css/identityManagement/viewDetails.css" />
<title>Recurring Deposit Application</title>
</head>
	<body>
		<jsp:include page="../header.jsp"/>
		<spring:form method="post" action ="${pageContext.request.contextPath}/user/RecurringDeposit_Success" 
			modelAttribute="recurringDepositInputDto">
			<h1 align="center" class="a">Recurring Deposit</h1>
			<br><br>
			
			<table>
				<tr>
					<center><th colspan="2" class="b">Recurring deposit Application</th></center>
					<br>
				</tr>
				
				<tr>
					<th><spring:label  path = "customerID">Customer ID</spring:label></th>
					<td><spring:input path = "customerID" type ="text" value="${custID}" readonly="true" /></td>
				</tr>
				
				<tr>
					<th><spring:label  path = "accHolderName">Customer Name</spring:label></th>
					<td><spring:input path = "accHolderName" type ="text" value="${accHolderName}" readonly="true"/></td>
				</tr>
				
				
				<tr>
					<th><spring:label  path = "monthlydeposit">Monthly Deposit Amount</spring:label></th>
					<td><spring:input path = "monthlydeposit" type ="text" /></td>
				</tr>
				<tr>
					<th><spring:label  path = "term" >Term Period(in years)</spring:label></th>
					<td><spring:input path = "term" type ="text" /></td>
				</tr>
				<tr>
					<th><spring:label  path = "applicationDate" >Application date</spring:label></th>
					<td><spring:input path = "applicationDate" type ="date"/></td>
				</tr>
				
				<tr>
					<th><spring:label  path = "ROI" >Rate of Interest</spring:label></th>
					<td><spring:input path = "ROI" type ="text" value = "10" readonly="true"/></td>
				</tr>
			</table>
			<br>
		<spring:button class="btn btn-danger btn-sm" type = "submit"><b>APPLY RD</b></spring:button>
		
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