<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../../css/background.css" />
<link rel="stylesheet" type="text/css" href="../../css/customerResetPassword.css" />
<title>Reset Password</title>
</head>
<body >

	<h1 id="welcomeText" align="center">Reset your password</h1>
	<br/><br/>
	<%
		String username = session.getAttribute("userID").toString();
		String password = session.getAttribute("password").toString();
		
		if(session.getAttribute("passwordChange")==null)
		{
			//session.setAttribute("passwordChange", "request");
	%>
	<br/><br/>
	<form class="resetForm" method="POST" action="customerHome">
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
			<input type="button" value="Cancel" id="btnCancel" onclick="closeMe()"/>
		</form>
		
	
	<%  } else {%>
	
	<% if(session.getAttribute("passwordChange").toString().equalsIgnoreCase("true")) { //session.removeAttribute("passwordChange"); %>
	
	<h3 align="center" style="color:green;">Password change Successful !!!</h3>
	<p align="center">click on close button to go back to Home Page</p>
	<div>
	<input type="button" value="Close Window" id="btnClose" onclick="closeMe()"/>
	</div>
	
	<% 	} 	else { //session.removeAttribute("passwordChange");%>
	
	<h3 align="center" style="color:red;">Password change unsuccessful !!!</h3>
	<p align="center" >click on close button to go back to Home Page and change again</p>
	<div>
	<input type="button" value="Close Window" id="btnClose" onclick="closeMe()"/>
	</div>
	
	<% } } %>
	
	
	<script>
		function closeMe()
		{
		    window.opener = self;
		    window.close();
		}
</script>
	
</body>
</html>