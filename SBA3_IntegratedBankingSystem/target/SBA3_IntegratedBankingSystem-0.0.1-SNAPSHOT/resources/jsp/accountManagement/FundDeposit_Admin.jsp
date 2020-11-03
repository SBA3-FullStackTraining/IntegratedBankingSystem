
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Fund Deposit Application</title>
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
		//String Beneficiary Name = session.getAttribute("Beneficiary Name").toString();
		//String Beneficiary Acc.No = session.getAttribute("Beneficiary Acc.No").toString();
		//String IFSC_Code = session.getAttribute("IFSC_Code").toString();
		
		
	%>
<center>
<h1 align="center" class="a">Fund Deposit Entry</h1>
<br><br>

<table border="4" width="70%" height="70px">
<tr>
<th colspan="2" class="b"><center>Sender Details </center></th>
</tr>

<tr>
<th>Sender Name</th><td><input type="text" placeholder="Sender Name"></td>
</tr>
<tr>
<th>Account Number</th><td><input type="text" placeholder="Account Number"></td>
</tr>
<tr>
<th>Transfer Amount</th><td><input type="text" placeholder="Transfer Amount"></td>
</tr>
<tr>
<th>IFSC_Code</th><td><input type="text" placeholder="IFSC_Code"></td>
</tr>

</table>

<table border="4" width="70%" height="70px">
<tr>
<th colspan="2" class="b"><center>Recipient Details </center></th>
</tr>

<tr>
<th>Recipient Name</th><td><input type="text" placeholder="Recipient Name"></td>
</tr>
<tr>
<th>Recipient Account Number</th><td><input type="text" placeholder="Account Number"></td>
</tr>
<tr>
<th>Recipient Bank Name</th><td><input type="text" placeholder="Recipient Bank Name"></td>
</tr>

<tr>
<th>IFSC_Code</th><td><input type="text" placeholder="IFSC_Code"></td>
</tr>

</table>

<br>
<button class="btn btn-danger btn-sm"><b>CONTINUE FUND DEPOSIT</b></button>
</center>
<h2><a href="AccountManagement.jsp">Account Management</a></h2>
</body>
</html>