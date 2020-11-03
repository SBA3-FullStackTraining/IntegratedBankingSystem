
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Recurring Deposit Verification</title>
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
.b{

 background-color:"#33ffcc";
 }
#c{
background-color:#33ffcc;}
h3{
color: #66a3ff;}
h5{
color:white;
}
th{
color:white;}
button{
color:white;
}
table{
table-border:black;}

</style>
</head>
<body>
<%
		// fetch the data from request object
		//LoginDetails loginInfo = (LoginDetails) request.getAttribute("loginInfo");
		// fetch from session
		// JSP PAGE is exposed with multiple predeclared object : request, response, session , writer...
		// Student student = (Student) session.getAttribute("student");
			//String recdepoaccountNumber = session.getAttribute("recdepoaccountNumber").toString();
			//String recdepositaccholder = session.getAttribute("recdepositaccholder").toString();
			//String depositamount = session.getAttribute("depositamount").toString();
			//String term = session.getAttribute("term").toString();
			//String rateofinterest = session.getAttribute("rateofinterest").toString();
			//String customername = session.getAttribute("customername").toString();
			//String maturitydate = session.getAttribute("maturitydate").toString();
		
		
	%>
<center>
<h1 align="center" class="a">Recurring Deposit</h1>
<br><br>

<table border="4" width="70%" height="70px">
<tr>
<th colspan="2" class="b"><center>Recurring deposit Verification</center></th>
</tr>
<tr>
<th>RD Account ID of Customer:</th>
</tr>
</tr>

<tr>
<th>Customer Name:</th>
</tr>
<tr>
<th>Deposit Amount:</th>
</tr>
<tr>
<th>Term Period:</th>
</tr>
<tr>
<th>Rate of Interest:</th>
</tr>
<tr>
<th>Maturity Date:</th>
</tr>
</table>
<br>
<button class="btn btn-danger btn-sm" href ="AccountManagement.html"><b>BACK TO ACCOUNTMANAGEMENT</b></button>
</center>
<h2><a href="AccountManagement.jsp">Account Management</a></h2>
</body>
</html>