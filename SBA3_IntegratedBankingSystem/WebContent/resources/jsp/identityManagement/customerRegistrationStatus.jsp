<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/background.css" />
<link rel="stylesheet" type="text/css" href="resources/css/customerResetPassword.css" />
<title>Customer Registration status</title>
</head>
<body>
	<h1 id="welcomeText" align="center">Customer Registration status</h1>
	<br/><br/>
	<%
		String updateSatus = session.getAttribute("updateFlag").toString();
		
		if(updateSatus.equalsIgnoreCase("true"))
		{
	%>
	<br/><br/>

	<h3 align="center" style="color:green8;">Customer registration Successful !!!</h3>
	<p align="center">Below mentioned are the further process involved.</p>
	<p>1. An Accounts Executive from IBS will verify those details and Approve/Decline the registration request.
	<br>2. In case of Approval a system generated password and UCI shall be shared with you through email provided.
    <br>3. In case of decline the same shall be communicated to you through an email.
	<br>
	<h5 align="center" style="color:green8;">Thanks for your interest !!!</h5>
	
	<%} else  { %>
	<h3 align="center" style="color:red;">Customer registration was UnSuccessful !!!</h3>
	<p align="center" >Try again by clicking on the below button</p>
	<% } session.removeAttribute("updateFlag");
	%>
	
	<div>
	<input type="button" value="Close Window" id="btnClose" onclick="closeMe()"/>
	</div>

	<script>
		function closeMe()
		{
		    window.opener = self;
		    window.close();
		}
</script>
	
</body>
</html>
