<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="static/css/identityManagement/customerRegister.css" />
<link rel="stylesheet" type="text/css" href="static/css/background.css" />
<title>Registration Page</title>
</head>
<body class="login_reg">
	<h1 id="welcomeText" align="center">Welcome to registration page</h1>
	<br/><br/><br/>
	<spring:form class="registerForm" method="POST" action="user/custRegister" modelAttribute="regCustomer">
		<table>
			<tbody>
				<tr class="heading" align="center">
					<td colspan="2">
						<h2>Fill in the details</h2>
					</td>
				</tr>
				<tr>
					<td align="right"><spring:label path="firstName">First Name :</spring:label></td>
					<td><spring:input type="text" path="firstName" name="firstName" /></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="lastName">Last Name : </spring:label></td>
					<td><spring:input type="text" name="lastName" path="lastName"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="phoneNumber">Phone : </spring:label></td>
					<td><spring:input type="text" name="phoneNumber" path="phoneNumber"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="email">Email : </spring:label></td>
					<td><spring:input type="text" name="email" path="email"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="dateOfBirth">Date of Birth : </spring:label></td>
					<td><spring:input type="text" name="dob" path="dateOfBirth"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="city">City : </spring:label></td>
					<td><spring:input type="text" name="city" path="city" /></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="state">State : </spring:label></td>
					<td><spring:input type="text" path="state" name="state"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="country">Country : </spring:label></td>
					<td><spring:input type="text" name="country" path="country"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="pincode">Pincode : </spring:label></td>
					<td><spring:input type="text" path="pincode" /></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="fullAddress">Address : </spring:label></td>
					<td><spring:input type="text" name="fullAddress" path="fullAddress"/></td>
				</tr>
				<tr>
					<td align="right"><spring:label path="givenID">Select ID : </spring:label></td>
					<td style="color: #d8225d;">
				        Adhaar <spring:radiobutton path="givenID" value="adhaar"/>
				        PAN <spring:radiobutton path="givenID" value="pan"/>  
					</td>
				</tr>
				<tr>
					<td align="right"><spring:label name="IDNumber" path="IDNumber">ID number : </spring:label></td>
					<td><spring:input type="text" name="IDNumber" path="IDNumber"/></td>
				</tr>
				<tr>
					<td align="right"><label>upload ID : </label></td>
					<td><input type="file" name="id_details"/></td>
				</tr>
				<tr>
					<td style="line-height: 10px;" colspan=3>&nbsp;</td>
				</tr>			
			</tbody>
		</table>
		<br> 
		<!-- <input type="submit" value="Register" id="register" /> -->
		<spring:button id="register" type="submit" >Register</spring:button>
		<a href="index"><input type="button" value="cancel" id="btnCancel"/></a>
	</spring:form>
</body>
</html>