
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Fixed Deposit Application</title>
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
<h1 align="center" class="a">Fixed deposit</h1>
<br><br>

<table border="4" width="70%" height="70px">
<tr>
<th colspan="2" class="b"><center>Fixed deposit Application</center></th>
</tr>
<tr>
<th>UID of Customer</th><td><input type="text" placeholder="UID"></td>
</tr>
</tr>


<tr>
<th>Customer Name</th><td><input type="text" placeholder="Customer Name"></td>
</tr>
<tr>
<th>Monthly Deposit</th><td><input type="text" placeholder="Monthly Deposit"></td>
</tr>
<tr>
<th>Term Period</th><td><input type="text" placeholder="Term Period"></td>
</tr>
<tr>
<th>Application date</th><td><input type="text" placeholder="Application date"></td>
</tr>

</table>
<br>
<button class="btn btn-danger btn-sm"><b>APPLY RD</b></button>
</center>
<h2><a href="AccountManagement.jsp">Account Management</a></h2>
</body>
</html>