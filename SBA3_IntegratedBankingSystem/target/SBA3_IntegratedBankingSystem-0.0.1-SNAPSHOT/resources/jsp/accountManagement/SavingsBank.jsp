<%@page import="com.banking.ibs.dto.Account"%>
<%@page import="com.banking.ibs.dto.AccountInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Savings Banking</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style>
.a{
border:2px solid #000;

height:60px;

color:red;
background-color:black;
}
.b{
border:2px solid #000;

height:30px;

color:red;
background-color:black;
}
body{
background-color:#525252;
}
li{
font-weight: bold;
color:#804d00;}
#z{
background-color:#33ffcc;}
#b{
background-color:white;}
#c{
background-color:#33ffcc;}
h3{
color: #66a3ff;}
h5{
color:white;
}

</style>
</head>
<body>
<%
		// fetch the data from request object
		//LoginDetails loginInfo = (LoginDetails) request.getAttribute("loginInfo");
		// fetch from session
		// JSP PAGE is exposed with multiple predeclared object : request, response, session , writer...
		// Student student = (Student) session.getAttribute("student");
		//String Savings Account Number = session.getAttribute("Account Number").toString();
		//String accountNumber = session.getAttribute("accountNumber").toString();
		//String accountDescription = session.getAttribute("accountDescription").toString();
		//String cutomername = session.getAttribute("cutomername").toString();
		//String accountbalance = session.getAttribute("accountDescription").toString();
		
		
	%>
<body>
<div class="a">
	<h1 align="center">Savings Banking</h1>
</div>
<h3>Savings Bank Details</h3><br>
<h5>Customer Name:</h5>
<h5>Savings Account Number:</h5>
<h5>Available Balance:</h5>
<br>
<br>
<div class="b">
	<h1></h1>
</div>
<form class="loginform" method="post" action="CustSavingsBank">
<div class="container">
<ul class="nav nav-tabs nav-justified">
<li id="z"><a href="Fundtransfer.jsp" data-toggle="tab">Fund Transfer</a></li>
<li id="b"><a href="StatementGeneration.jsp" data-toggle="tab">Statement generation</a></li>
<li id="c"><a href="BillPayment.jsp" data-toggle="tab">Bill Payment</a></li>

</ul>
</div>
</div>

</body>
</html>