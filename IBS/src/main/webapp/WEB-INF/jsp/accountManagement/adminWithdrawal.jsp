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
		<title>Savings Banking</title>
</head>
	<body>
		<jsp:include page="../header.jsp"/>
		<div class="a">
			<h1 align="center">Withdrawal</h1>
		</div>
		<!--<h3>Savings Bank Details</h3><br>  -->
	
		<br>
		<br>
		<spring:form method="post" action ="${pageContext.request.contextPath}/admin/Withdrawal_Success" 
			modelAttribute="transactionInputDto">
			
			<br><br>
			
			<table>
				<tr>
					<center><th colspan="2" class="b">Savings bank Application</th></center>
					<br>
				</tr>
				
				<tr>
					<th><spring:label  path = "customerId">Customer ID</spring:label></th>
					<td><spring:input path = "customerId" type ="text"/></td>
				</tr>
				
				<tr>
					<th><spring:label  path = "savingsAccID">Savings Account Number</spring:label></th>
					<td><spring:input path = "savingsAccID" type ="text"/></td>
				</tr>
				
				<tr>
					<th><spring:label  path = "amount" >Withdrawal Amount</spring:label></th>
					<td><spring:input path = "amount" type ="text" /></td>
				</tr>
				
				<tr>
					<th><spring:label  path = "lastTransationDate" >Transaction Date</spring:label></th>
					<td><spring:input path = "lastTransationDate" type ="date" /></td>
				</tr>
				
				
			</table>
			<br>
			<spring:button  type = "submit"><b>CONTINUE</b></spring:button>
		</spring:form>
		<br>
		<br>
		<center>
				<a href="adminHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
		<jsp:include page="../footer.jsp"/>
	</body>
</html>