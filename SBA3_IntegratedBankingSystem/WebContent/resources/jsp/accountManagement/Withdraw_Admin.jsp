
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Withdraw</title>
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
color: white;}
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
		//String accountNumber = session.getAttribute("accountNumber").toString();
		//String accountDescription = session.getAttribute("accountDescription").toString();
		//String cutomername = session.getAttribute("cutomername").toString();
		//String accountbalance = session.getAttribute("accountDescription").toString();
		
		
		
	%>
<center>
<h1 align="center" class="a">Withdraw Request Entry</h1>
<br><br>


<table border="4" width="70%" height="70px">
<tr>
<th colspan="2" class="b"><center>Recipient Details </center></th>
</tr>

<tr>
<th>Account No</th><td><input type="text" placeholder="Account No"></td>
</tr>
<tr>
<th>Account Holder Name</th><td><input type="text" placeholder="Account Holder Name"></td>
</tr>
<tr>
<th>IFSC_Code:</th><td><input type="text" placeholder="IFSC_Code:"></td>
</tr>

<tr>
<th>Withdraw Amount</th><td><input type="text" placeholder="Withdraw Amount"></td>
</tr>

</table>

<br>
<button class="btn btn-danger btn-sm"><b>SUBMIT</b></button>
<br>
<br>

<h5>Account No:</h5>



<h5>Account Balance:</h5>

<br>

<button align="center" class="btn btn-danger btn-sm"><b>CONTINUE WITHDRAW</b></button>
</center>
<h2><a href="AccountManagement.jsp">Account Management</a></h2>
</body>
</html>