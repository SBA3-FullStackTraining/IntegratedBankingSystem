
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix ="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Fixed Deposit Verification</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/fixedDeposit_application.css" />
		<link rel="stylesheet" type="text/css" href="static/css/accountManagement/background.css" />
	</head>
	<body>
		<jsp:include page="header.jsp"/>
		<div align="center" id="container">
		<h3>FIXED DEPOSIT DETAILS</h3>
		<div id="content">
		
			<!--  add our html table here -->
		
			<table id="table">
				<tr>
					
					<th>CustomerID</th>
					<th>AccHolder Name</th>
					<th>Fixed Deposit ID</th>
					<th>Application Date</th>
					<th>Fixed Deposit Amount</th>
					<th>Term(in years)</th>
					<th>ROI</th>
					<th>Maturity Date</th>
					<th>Interest Amount</th>
					<th>Total Amount After Maturity</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="fixed" items="${fixedDepositDto}">
							
					<tr>
						<td> ${fixed.customerID} </td>
						<td> ${fixed.accHolderName}</td>
						<td> ${fixed.fixedDepositID} </td>
						<td> ${fixed.applicationDate} </td>
						<td> ${fixed.fixedDepositAmt} </td>
						<td> ${fixed.term} </td>
						<td> ${fixed.ROI} </td>
						<td> ${fixed.maturityDate}</td>
						<td> ${fixed.interestAmt} </td>
						<td> ${fixed.totalAmt}</td>
						
						
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	</div>
	

		<jsp:include page="footer.jsp"/>
	</body>
</html>