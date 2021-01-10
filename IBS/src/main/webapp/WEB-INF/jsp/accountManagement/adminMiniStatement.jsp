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
	<title>Mini Statement</title>
		


</head>

<body>
<jsp:include page="../header.jsp" />
	
	
	<div align="center" id="container">
		<h3>MINI STATEMENT</h3>
		<div id="content">
		<h6>Your last five transactions</h6>
			<!--  add our html table here -->
		
			<table id="table">
				<tr>
					<th>From Account</th>
					<th>CustomerID</th>
					<th>TransactionDate</th>
					<th>ToAccount</th>
					<th>Amount</th>
					<th>Message</th>
					<th>TransactionID</th>
					<th>TransactionType</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach begin="0" end="4"  var="txn" items="${statement}">
							
					<tr>
						<td> ${txn.savingsAccID} </td>
						<td> ${txn.customerId}</td>
						<td> ${txn.lastTransationDate} </td>
						<td> ${txn.toAcc} </td>
						<td> ${txn.amount} </td>
						<td> ${txn.message} </td>
						<td> ${txn.transID} </td>
						<td> ${txn.txnType}</td>
						
						
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	</div>
	<br>
	<br>
	
		<center>
			<a href="adminHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
	<br>
	<br>
	
<jsp:include page="../footer.jsp" />
</body>

</html>









