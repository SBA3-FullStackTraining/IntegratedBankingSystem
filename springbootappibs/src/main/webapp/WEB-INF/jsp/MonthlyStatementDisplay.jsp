<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>

<html>

<head>
	<title>Monthly  Statement</title>
	
	<!-- reference our style sheet -->

</head>

<body>

<jsp:include page="header.jsp" />
	
	
	<div align="center" id="container">
		<h3>MONTHLY STATEMENT OF ${month}</h3>
		<div id="content">
		<h6>TRANSACTIONS</h6>
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
				<c:forEach begin="0" end="4"  var="txn" items="${transaction}">
							
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
	
	
<jsp:include page="footer.jsp" />
</body>


</html>









