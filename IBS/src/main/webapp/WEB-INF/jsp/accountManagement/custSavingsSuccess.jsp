
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
		<title>Savings Banking-Success</title>
	</head>
	<body>
		<jsp:include page="../header.jsp"/>
		<div class="a">
			<h1 align="center">Savings Banking</h1>
		</div>
		<!--<h3>Savings Bank Details</h3><br>  -->
		<h3>Welcome<b>  ${savingsOutputDto.accHolderName}</b></h3>
		<br>
		<br>
		<h3>Application Submitted Successfully!!! Below are the details</h3>
		<br>
		<br>
		<spring:form class="loginform" method="post">
			<h5>Customer ID -  <b>${savingsOutputDto.customerID}</b></h5>
			<h5>Account Holder Name -  <b>${savingsOutputDto.accHolderName}</b></h5>
			<h5>Savings Account ID - <b>${savingsOutputDto.savingsAccID}</b></h5>
			<h5>Application Date -  <b>${savingsOutputDto.applicationDate}</b></h5>
			<h5>Opening Balance -  <b>${savingsOutputDto.openingBalance}</b></h5>
			<h5>Available - <b>${savingsOutputDto.avlBalance}</b></h5>
			<br>
			
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