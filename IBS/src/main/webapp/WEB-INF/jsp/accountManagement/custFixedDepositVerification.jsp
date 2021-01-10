
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
<title>Fixed Deposit Verification</title>
	</head>
	<body>
		<jsp:include page="../header.jsp"/>
		<div align="center" id="container">
		<h3>FIXED DEPOSIT DETAILS</h3>
		<div id="content">
		
			<!--  add our html table here -->
		
			
						
			<c:forEach var="fixed" items="${fixedDepositDto}">			
			<br>
			<br>
			<br>
			 <table>
				<tr>
					<th><label >Customer ID</label></th>
					<td><input type ="text" value="${fixed.customerID}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label>Fixed Deposit ID</label></th>
					<td><input  type ="text" value="${fixed.fixedDepositID}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label >Account HolderName</label></th>
					<td><input  type ="text" value="${fixed.accHolderName}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label >Application Date</label></th>
					<td><input  type ="text" value="${fixed.applicationDate}" readonly="true" /></td>
				</tr>
				
				<tr>
					<th><label >Term(in years)</label></th>
					<td><input  type ="text" value="${fixed.term}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label >Rate Of Interest</label></th>
					<td><input  type ="text" value="${fixed.ROI}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label >Maturity Date</label></th>
					<td><input  type ="text" value="${fixed.maturityDate}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label >Interest Amount</label></th>
					<td><input  type ="text" value="${fixed.interestAmt}" readonly="true" /></td>
				</tr>
				<tr>
					<th><label >Totally Amount after Maturity</label></th>
					<td><input type ="text" value="${fixed.totalAmt}" readonly="true" /></td>
				</tr>
			</table>   
			
			</c:forEach>
	
		</div>
	</div>
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