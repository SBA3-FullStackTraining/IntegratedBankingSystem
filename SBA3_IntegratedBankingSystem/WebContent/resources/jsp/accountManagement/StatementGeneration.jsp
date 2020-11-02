
<%@ page import = "java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Generate Statement</title>
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
<h1 align="center" class="a">Statement  Generation</h1>
<br><br>

<table border="0" width="70%" height="70px">
<tr>
<th colspan="2" class="b"><center>Statement Generation</center></th>
</tr>
<tr>
<th>Account Number</th>
<td><select><option value="Account No">Choose Your Account</option>
<option value="Acc No 1"></option>
</select>
</tr>

<tr>
<th>Account Holder Name</th>
</tr>
<tr>
<th>Statement Type</th>
<td><select><option value="Account No">Choose Your Account</option>
<option value="Mini Statement">Mini Statement</option>
<option value="Monthly Statement">Monthly Statement</option>
<option value="Annual Statement">Annual Statement</option>
<option value="Periodic Statement" >Periodic Statement</option>

</select>
</tr>
<tr>
<th>From Date</th><td><input type="date" ></input></td>
</tr>
<tr>
<th>To Date</th><td><input type="date"></input></td>
</tr>
</table>
<br>
<button class="btn btn-danger btn-sm"><b>GENERATE</b></button>
</center>
<h2><a href="SavingsBank.jsp">Savings Bank</a></h2>
</body>
</html>