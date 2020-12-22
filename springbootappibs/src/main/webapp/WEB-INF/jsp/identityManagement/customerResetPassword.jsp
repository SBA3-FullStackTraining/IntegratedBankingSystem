<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerResetPassword.css" />

<title>Reset Password</title>
</head>
<body >

	<h1 id="welcomeText" align="center">Reset your password</h1>
	<br/><br/>
	<%-- <%
		String username = session.getAttribute("userID").toString();
		String password = session.getAttribute("password").toString();
		
		if(session.getAttribute("passwordReset").toString().equalsIgnoreCase("request"))
		{
	%> --%>
	<c:if test="${reset=='request'}">
	<br/><br/>
	<spring:form class="resetForm" method="POST" action="passwordUpdate" modelAttribute="updateCusCred">
		<table class="table">
			<tbody>
				<tr>
					<td style="line-height: 15px;" colspan=3>&nbsp;</td>
				</tr>
				<tr>
					<td><spring:label path="customerID">Customer ID : </spring:label></td>
					<td><spring:input type="text" name="customerID" value="${creds.customerID}" path="customerID" readonly="readonly"/></td>
				</tr>
				<tr>
					<td><label>Current password : </label></td>
					<td><input type="text" name="currentPassword" value="${creds.password}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td><spring:label path="password">New Password : </spring:label></td>
					<td><spring:input type="text" name="password" path="password"/></td>
				</tr>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>			
			</tbody>
		</table>
		<br> 
			<!-- <input type="submit" value="Ok" id="btnOk"/> -->
			<spring:button type="submit" id="btnOk">Ok</spring:button>
			<a href="index"><input type="button" value="Cancel" id="btnClose"/></a>
			<!-- <a href="customerHome"><input type="button" value="Cancel" id="btnCancel"></a> -->
		</spring:form>
		
		</c:if>
	<%-- <%  session.setAttribute("passwordReset", "done"); } else {%> --%>
	
	<c:if test="${reset=='done'}">
	
	<%-- <% if(session.getAttribute("passwordReset").toString().equalsIgnoreCase("true")) { //session.removeAttribute("passwordChange"); %>
 --%>	
 
 	<c:if test="${status=='done'}">
	<h3 align="center" style="color:#026d00;">Password change Successful !!!</h3>
	<p align="center">click on close button to go back to Home Page</p>
	<div align="center">
	<a href="index"><input type="button" value="Ok" id="btnOk"/></a>
	</div>
	</c:if>
	<%-- <% 	} 	else { %> --%>
	<c:if test="${status=='undone'}">
	
	<h3 align="center" style="color:red;">Password change unsuccessful !!!</h3>
	<p align="center" >click on close button to go back to Home Page and change again</p>
	<div align="center">
	<a href="customerHome"><input type="submit" value="Ok" id="btnOk"/></a>
	</div>
	
	<%-- <% } session.removeAttribute("passwordReset"); } %> --%>
	
	</c:if>
	<div align="center">
	<a href="index"><input type="button" value="Cancel" id="btnClose"/></a>
	</div>
	</c:if>
</body>
</html>