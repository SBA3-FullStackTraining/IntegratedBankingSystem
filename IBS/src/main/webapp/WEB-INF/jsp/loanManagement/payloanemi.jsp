<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pay Loan EMI</title>
<link rel="stylesheet" type="text/css" href="resources/static/css/loanManagement/payloanemi.css" />
		<link rel="stylesheet" type="text/css" href="resources/static/css/loanManagement/background.css" />
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body bgcolor="lightblue">
<form action="payloanemi" method="get">
<H2 style="text-align:center">EMI Amount</H2>
<label>Choose Account Number</label><spring:select name="loanId" path="loanId">
										<spring:option value=""></spring:option>
									</spring:select>
									<br/>
<lable>EMI Amount</lable>    <spring:input type="text" name="emiamount"></spring:input>
<BR/>
<lable>Select EMI Month & Year</lable> 
<spring:select name="month" id="month" path="month">                       
<option value="January">January</option>
<option value="February">February</option>
<option value="March">March</option>
<option value="April">April</option>
<option value="May">May</option>
<option value="June">June</option>
<option value="July">July</option>
<option value="August">August</option>
<option value="September">September</option>
<option value="October">October</option>
<option value="November">November</option>
<option value="December">December</option>
</spring:select>
<select name="year" id="year">                       
<option value="2019">2019</option>
<option value="2020">2020</option>
</select>
<br>
<input type="submit" value="Click here to Pay">
</form>
</body>
</html>