<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>login</title>

</head>
<body>
	
	<div align="center">
	
	<%-- if url contains a 'error' param --%>
	<core:if test="${param.error != null }">
		<i class="error">Invalid Credentials!!</i>
	</core:if>
	<br />
	
	<spring:form action="${pageContext.request.contextPath}/validate"
		method="POST">

		<table>
			<tr>
				<td><label>Enter Customer ID</label></td>
				<td><input  type="text" name="username"  /></td>
			</tr>
			<tr>
				<td><label>Enter Password</label></td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" /></td>
				<td><a href="register">Register Here</a></td>
			</tr>

		</table>

	</spring:form>
	<br />
	<core:if test="${param.logout != null }">
		<i>You have been successfully logged out!</i>
	</core:if>
	</div>
	
</body>
</html>