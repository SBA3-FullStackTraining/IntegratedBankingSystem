
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Fund Tranfer</title>
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
		//String benfaccountNumber = session.getAttribute("benfaccountNumber").toString();
		//String benfname = session.getAttribute("benfname").toString();
		//String benfIFSC = session.getAttribute("benfIFSC").toString();
		
		
	%>
<center>
<h1 align="center" class="a">Fund Transfer</h1>
<br><br>

<table border="4" width="70%" height="70px">
<tr>
<th colspan="2" class="b"><center>Beneficiary Details</center></th>
</tr>
<tr>
<th>From Account</th>
<td><select><option value="Account No">Choose Your Account</option>
<option value="Acc No 1"></option>

</select>
</tr>
<tr>
<th>Beneficiary Account No</th>
<td><select><option value="Account No">Select Benf  Account</option>
<option value="Acc No 1"></option>
<option value="Acc No 2"></option>
</select>
</td>
</tr>

<tr>
<th>IFSC_Code</th><td><input type="text" placeholder="IFSC_Code"></td>
</tr>
<tr>
<th>Transfer Amount</th><td><input type="text" placeholder="Transfer Amount"></td>
</tr>
<tr>
<th>Transfer Description</th><td><input type="text" placeholder="Transfer Descriptiom"></td>
</tr>
<tr>
<th>Transaction Password</th><td><input type="password"></td>
</tr>
</table>
<br>
<button class="btn btn-danger btn-sm"><b>CONFIRM</b></button>


</center>
<h2><a href="SavingsBank.jsp">Savings Bank</a></h2>
</body>
</html>