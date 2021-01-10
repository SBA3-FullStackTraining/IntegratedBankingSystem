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
<style>
h3{color: red;
}
</style>
<title>Transaction Successful-Withdraw</title>
</head>

<body>
		<jsp:include page="../header.jsp"/>
		<center><h3>Congratulations!!!your Withdrawal is completed successfully for the Customer-${transactionOutputDTO.customerId}...Below are the details </h3>
			<h5>From Account: <b>${transactionOutputDTO.savingsAccID}</b></h5>
			<h5>CustomerID: <b>${transactionOutputDTO.customerId}</b></h5>
			<h5>TransactionDate: </b>${transactionOutputDTO.lastTransationDate}</b></h5>
			<h5>Withdrawal Amount: <b>${transactionOutputDTO.amount}</b></h5>
			<h5>TransactionID: <b>${transactionOutputDTO.transID}</b></h5>
			<h5>TransactionType: <b>${transactionOutputDTO.txnType}</b></h5>
			<h5>Closing Balance: <b>${transactionOutputDTO.closingBal}</b></h5>
			<br>
			<center>
				<a href="adminHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
			</center>
			<br>
		<jsp:include page="../footer.jsp"/>
</body>