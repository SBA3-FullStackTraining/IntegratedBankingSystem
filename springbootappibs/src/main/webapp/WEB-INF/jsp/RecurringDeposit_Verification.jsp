
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
		<h3>RECURRING DEPOSIT DETAILS</h3>
		<div id="content">
		
			<!--  add our html table here -->
		
			<table id="table">
				<tr>
					
					<th>CustomerID</th>
					<th>AccHolder Name</th>
					<th>Recurring Deposit ID</th>
					<th>Application Date</th>
					<th>Monthly Paymnet</th>
					<th>Term(in years)</th>
					<th>ROI</th>
					<th>Maturity Date</th>
					<th>Interest Amount</th>
					<th>Total Amount After Maturity</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="recurring" items="${recurringDepositDto}">
							
					<tr>
						<td> ${recurring.customerID} </td>
						<td> ${recurring.accHolderName}</td>
						<td> ${recurring.recurringDepositID} </td>
						<td> ${recurring.applicationDate} </td>
						<td> ${recurring.monthlydeposit} </td>
						<td> ${recurring.term} </td>
						<td> ${recurring.ROI} </td>
						<td> ${recurring.maturityDate}</td>
						<td> ${recurring.interestAmt} </td>
						<td> ${recurring.totalAmt}</td>
						
						
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	</div>
	

		<jsp:include page="footer.jsp"/>
	</body>
</html>