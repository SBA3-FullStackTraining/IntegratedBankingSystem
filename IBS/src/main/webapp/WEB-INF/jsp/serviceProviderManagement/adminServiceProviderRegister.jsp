<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../static/css/identityManagement/customerRegister.css" />
<link rel="stylesheet" type="text/css" href="../static/css/background.css" />
<title>Registration Page</title>
</head>
<body class="login_reg">

	<h1 id="welcomeText" align="center">Welcome to Service Provider Registration page</h1>
	<br/><br/><br/>
	<spring:form class="registerForm" method="POST" action="${pageContext.request.contextPath}/admin/ViewServiceProviderDetails" modelAttribute="serviceInputDto">
		<table>
			<tbody>
				<tr class="heading" align="center">
					<td colspan="2">
						<h2>Fill in the details</h2>
					</td>
				</tr>
				<tr>
					<td align="right"><spring:label path="providerDetails">Provider Details :</spring:label></td>
					<td><spring:input type="text" path="providerDetails" name="providerDetails" /></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="spiUtility">SPI Utility : </spring:label></td>
					<td><spring:input type="text" name="spiUtility" path="spiUtility"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="spBankName">SP BankName : </spring:label></td>
					<td><spring:input type="text" name="spBankName" path="spBankName"/></td>
				</tr>
				
				<tr>
					<td align="right"><spring:label path="spAccNo">SP Account Number : </spring:label></td>
					<td><spring:input type="text" name="spAccNo" path="spAccNo"/></td>
				</tr>
				
				<tr>
					<td align="right"><spring:label path="givenID">PAN :</spring:label></td>
					<td><spring:input type="text" name="givenID" path="givenID"/></td>
				</tr>
				
				
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>			
			</tbody>
		</table>
		<br> 
		<!-- <input type="submit" value="Register" id="register" /> -->
		<spring:button id="register" type="submit" >Register</spring:button>
		<a href="adminHome"><input type="button" value="cancel" id="btnCancel"/></a>
	</spring:form>
</body>
<jsp:include page="../footer.jsp"/>
</html>