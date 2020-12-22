<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerResetPassword.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/viewDetails.css" />

<title>Customer Registration status</title>
</head>
<body>
	<h1 id="welcomeText" align="center">Customer Registration status</h1>
	
	<c:if test="${updateFlag=='true'}">
	<br/><br/>
	
		<h3 align="center" style="color:#026d00;">Customer registration Successful !!!</h3>
		
		<div class="table">
				<h4  align="center">Below mentioned are the further process involved.</h4>
				<p>1. An Accounts Executive from IBS will verify those details and Approve/Decline the registration request.
				<br>2. In case of Approval a system generated password and UCI shall be shared with you through email provided.
			    <br>3. In case of decline the same shall be communicated to you through an email.
				<br></p>
		</div>
		<h4 align="center" style="color:#2d2dad;">Thanks for your interest !!!</h4>
		
		<br>
		<br>
		<div class="table_min">
		<h4  align="center">Here is your registered Login details.</h4>
		<b>Customer ID : </b><b style="color: antiquewhite;">${customerID}</b><br>
		<b>Generated password : </b><b style="color: antiquewhite;">${OTP}</b>
		<br>
		<br>
		<p>Note: Kindly login to check. User need to change the password on first login.</p>
		</div>
		<br>
		</c:if>
		<c:if test="${updateFlag=='false'}">		
		<h3 align="center" style="color:red;">Customer registration was UnSuccessful !!!</h3>
		<div class="table_min">
		<p align="center" >Try again by clicking on the below button</p>
		</div>
		</c:if>
	<br>
	<br>
	<div>
		<a href="index"><input type="button" value="Back" id="btnClose"/></a>
	</div>
	
</body>
</html>
