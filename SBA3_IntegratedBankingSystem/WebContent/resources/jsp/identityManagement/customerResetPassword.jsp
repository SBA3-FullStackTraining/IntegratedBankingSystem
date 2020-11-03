<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/background.css" />
<link rel="stylesheet" type="text/css" href="resources/css/customerResetPassword.css" />
<title>Reset Password</title>
</head>
<body >

	<h1 id="welcomeText" align="center">Reset your password</h1>
	<br/><br/>
	<%
		String username = session.getAttribute("userID").toString();
		String password = session.getAttribute("password").toString();
		
		if(session.getAttribute("passwordReset").toString().equalsIgnoreCase("request"))
		{
	%>
	<br/><br/>
	<form class="resetForm" method="POST" action="customerUpdateDetails">
		<table>
			<tbody>
				<tr>
					<td style="line-height: 15px;" colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td><label>Current password : </label></td>
					<td><input type="text" name="currentPassword" /></td>
				</tr>
				<tr>
					<td><label>New Password : </label></td>
					<td><input type="text" name="newPassword" /></td>
				</tr>
				<tr>
					<td><label>Re-Enter New Password : </label></td>
					<td><input type="password" name="reEnterPassword" /></td>
				</tr>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>			
			</tbody>
		</table>
		<br> 
		
			<input type="submit" value="Ok" id="btnOk"/>
			<a href="customerHome"><input type="button" value="Cancel" id="btnCancel"></a>
		</form>
		
	
	<%  session.setAttribute("passwordReset", "done"); } else {%>
	
	<% if(session.getAttribute("passwordReset").toString().equalsIgnoreCase("true")) { //session.removeAttribute("passwordChange"); %>
	
	<h3 align="center" style="color:green;">Password change Successful !!!</h3>
	<p align="center">click on close button to go back to Home Page</p>
	<div>
	<a href="customerHome"><input type="submit" value="Close Window" id="btnClose"/></a>
	</div>
	
	<% 	} 	else { %>
	
	<h3 align="center" style="color:red;">Password change unsuccessful !!!</h3>
	<p align="center" >click on close button to go back to Home Page and change again</p>
	<div>
	<a href="customerHome"><input type="submit" value="Close Window" id="btnClose"/></a>
	</div>
	
	<% } session.removeAttribute("passwordReset"); } %>
	
	
</body>
</html>