
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix ="spring"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Fixed Deposit Application</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="../../static/css/accountManagement/fixedDeposit_application.css" />
		<link rel="stylesheet" type="text/css" href="../../static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<spring:form method="post" action ="${pageContext.request.contextPath}/user/FixedDeposit_Success/${custID}" 
			modelAttribute="fixedDepositInputDto">
			<h1 align="center" class="a">Fixed Deposit</h1>
			<br><br>
			
			<table>
				<tr>
					<center><th colspan="2" class="b">Fixed deposit Application</th></center>
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
					<th><spring:label  path = "fixedDepositAmt">Deposit Amount</spring:label></th>
					<td><spring:input path = "fixedDepositAmt" type ="text" /></td>
				</tr>
				<tr>
					<th><spring:label  path = "term" >Term Period(in years)</spring:label></th>
					<td><spring:input path = "term" type ="text"  value= "1" readonly="true"/></td>
				</tr>
				<tr>
					<th><spring:label  path = "applicationDate" >Application date</spring:label></th>
					<td><spring:input path = "applicationDate" type ="text"/></td>
				</tr>
				
				<tr>
					<th><spring:label  path = "ROI" >Rate of Interest</spring:label></th>
					<td><spring:input path = "ROI" type ="text" value = "6.5" readonly="true"/></td>
				</tr>
			</table>
			<br>
		<spring:button class="btn btn-danger btn-sm" type = "submit"><b>APPLY FD</b></spring:button>
		
		</spring:form>
		<jsp:include page="footer.jsp"/>
	</body>
</html>