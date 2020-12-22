<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %> --%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%-- <c:set var="root" value="${pageContext.request.contextPath}"/> --%>
 <link rel="stylesheet" type="text/css" href="static/css/identityManagement/index.css" />
<link rel="stylesheet" type="text/css" href="static/css/background.css" />  
<link rel="stylesheet" type="text/css" href="static/css/identityManagement/customerLogin.css" /> 
<script type="text/javascript" src="static/js/index.js"></script>
<title>Login Page</title>
</head>
<body class="login_reg">

<jsp:include page="header.jsp"/>
	<br/><br/><br/><br/><br/>
	<div class="tab"> 
		<input type="button" class="tablinks" value="Customer" onclick="doLogin(event, 'Customer')" id="defaultOpen" >
		<input type="button" class="tablinks" value="Admin" onclick="doLogin(event, 'Admin')">
	</div>
	
	<div id="Customer" class="tabcontent">
		<spring:form class="custLoginform" method="post" action="user/userHome" modelAttribute="customerCreds">
		<table>
			<tbody>
				<tr>
					<td align="right"><spring:label path="customerID">Customer ID :</spring:label></td>
					<td><spring:input type="text" name="customerID" path="customerID"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="password">Password : </spring:label></td>
					<td><spring:input type="password" name="password" path="password"/></td>
				</tr>
			</tbody>
		</table>
		<br/>
		<!-- <input type="submit" value="Login" id="login"/> -->
		<spring:button type="submit" id="login">Login</spring:button>
		<a href="register"><input type="button" value="Register" id="register" style="margin-left: 70px;"/></a>
		<br/><br/>
	</spring:form>
	</div>
	
	<div id="Admin" class="tabcontent">
		<spring:form class="adminLoginform" method="post" action="admin/adminHome" modelAttribute="adminCreds">
		<table>
			<tbody>
				<tr>
					<td align="right"><spring:label path="adminID">Admin ID :</spring:label></td>
					<td><spring:input type="text" name="adminID" path="adminID"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="password">Password : </spring:label></td>
					<td><spring:input type="password" name="password" path="password"/></td>
				</tr>
			</tbody>
		</table>
		<br/>
		<!-- <input type="submit" value="Login" id="login" /> -->
		<spring:button type="submit" id="login">Login</spring:button>
		<br/><br/>
	</spring:form>
	</div>
	
	<script>document.getElementById("defaultOpen").click();</script>
	<jsp:include page="footer.jsp"/>
</body>
</html>