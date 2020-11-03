<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apply for Loan</title>
</head>
<body bgcolor = "LightBlue">
<h1 style="text-align:center">Apply for Loan</H1>
<h2>Select the loan you want to apply</h2> <br/>
<form action="loansummary" method="Post">
<select name=ltype id=Ltype>
 <option value="Personal" selected>Personal</option>
 <option value="Vehicle">Vehicle</option>
 <option value="Educational">Educational</option>
 <option value="Home">Home</option>
</select>
<hr/>
<table>
<tr><lable>Enter the Loan Amount</lable> <input type="text" name=loanamount id=Loanamount></tr>
<BR/>
<lable>Select Tenure in Months</lable>
<Select name=loanmonths id=Loanmonths>
	<option value=12>12</option>
	<option value=24>24</option>
	<option value=36>36</option>
	<option value=48>48</option>
	<option value=60>60</option>
	<option value=240>240</option>
</select>
</table>
<input type="submit" value="Apply for Loan">
</form>
</body>
</html>