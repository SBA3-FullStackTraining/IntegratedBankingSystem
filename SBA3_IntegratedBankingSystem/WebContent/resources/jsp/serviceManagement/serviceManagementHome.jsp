<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Utility Provider</title>
</head>
<body bgcolor = "LightBlue">
<h1 style="text-align:center">Select Utility Provider</H1>
<h2>Select the loan you want to apply</h2> <br/>
<form action="" method="Post">
<select name=ltype id=Ltype>
 <option value="ElectricBoard" selected>ElectricBoard</option>
 <option value="WaterSupply">WaterSupply</option>
 <option value="PhoneBill">PhoneBill</option>
 <option value="Home">Home</option>
</select>
<hr/>

<lable>Enter the Amount</lable> <input type="text" name=Payamount id=Payamount/>
<br/>

<input type="submit" value="PayBill">
</form>
</body>
</html>