<%@page import="com.banking.ibs.dto.LoginDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Account Management</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style>
.a{
border:2px solid #000;

height:60px;

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
</style>
</head>
<body>
<div class="a">
	<h1 align="center">Account Management</h1>
</div>

<form class="loginform" method="post" action="Account">
<div class="container">
<ul class="nav nav-tabs nav-justified">
<li id="z"><a href="SavingsBank.jsp" data-toggle="tab">Savings Bank</a></li>
<li id="b"><a href="FixedDeposit.jsp" data-toggle="tab">Fixed Deposit</a></li>
<li id="c"><a href="RecurringDeposit.jsp" data-toggle="tab">Recurring Deposit</a></li>

</ul>
</div>
</div>
</form>

<%
		// fetch the data from request object
		//LoginDetails loginInfo = (LoginDetails) request.getAttribute("loginInfo");
		// fetch from session
		// JSP PAGE is exposed with multiple predeclared object : request, response, session , writer...
		// Student student = (Student) session.getAttribute("student");
		//String username = session.getAttribute("username").toString();
		//String UID = session.getAttribute("UID").toString();
	%>




</body>
</html>