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
<title>Transaction Successful-BillPayment</title>
</head>

<body>
		<jsp:include page="../header.jsp"/>
		<center><h3>Congratulations!!!your Payment is completed successfully...Below are the details </h3>
		<h5>From Account: <b>${transactionOutputDto.savingsAccID}</b></h5>
		<h5>CustomerID: <b>${transactionOutputDto.customerId}</b></h5>
		<h5>TransactionDate: <b>${transactionOutputDto.lastTransationDate}</b></h5>
		<h5>Transfer Amount: <b>${transactionOutputDto.amount}</b></h5>
		<h5>TransactionID: <b>${transactionOutputDto.transID}</b></h5>
		<h5>TransactionType: <b>${transactionOutputDto.txnType}</b></h5>
		<h5>Closing Balance: <b>${transactionOutputDto.closingBal}</b></h5>
		<br>
		<br>
	
		<center>
			<a href="userHome"><input type="button" name="navigateback" value="BACK" id="btnBack"></a>
		</center>
	<br>
	<br>
		<jsp:include page="../footer.jsp"/>
</body>